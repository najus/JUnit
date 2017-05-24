package com.najus.katas.converter;

import java.util.LinkedHashMap;
import java.util.Map;

import java.util.Map.Entry;

public class UnrepeatedLetter {

	Map<Character, Integer> charMap;

	public char findFirstUnrepeatedLetter(String string) {
		charMap = new LinkedHashMap<>();
		string.chars().forEach(s -> {
			if (charMap.containsKey((char) s)) {
				charMap.put((char) s, charMap.get((char) s) + 1);
			} else {
				charMap.put((char) s, 1);
			}
		});

		Entry<Character, Integer> temp = charMap.entrySet().stream().filter(x -> x.getValue().equals(1)).findFirst()
				.get();
		return temp.getKey();
	}

}
