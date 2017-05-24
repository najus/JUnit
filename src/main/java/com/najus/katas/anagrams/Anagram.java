package com.najus.katas.anagrams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {

	String inputPath;

	public Anagram(String inputPath) {
		this.inputPath = inputPath;
	}

	public Map<String, List<String>> getAllAnagrams() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(inputPath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Map<String, List<String>> sortedMapOfAnagrams = reader.lines().collect(Collectors.groupingBy(x -> sorted(x)));
		return sortedMapOfAnagrams;

	}

	private String sorted(String word) {
		char[] wordAsCharArray = word.toCharArray();
		Arrays.sort(wordAsCharArray);
		return new String(wordAsCharArray);
	}

}
