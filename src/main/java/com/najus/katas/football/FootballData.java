package com.najus.katas.football;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FootballData {

	private String inputPath;

	public FootballData(String inputPath) {
		this.inputPath = inputPath;
	}

	public BufferedReader readData() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(inputPath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return reader;
	}

	public String getTeamHavingSmallestGoalDifference() {
		
		Map<String, Integer> result = new LinkedHashMap<>();

		BufferedReader reader = readData();
		Map<String, Integer> temp = reader.lines()
				.map(x -> x.replaceAll("-", ""))
				.map(x -> x.replaceAll("[ ]+", " "))
				.map(x -> x.trim())
				.filter(x -> x.length() > 0)
				.filter(x -> !x.startsWith("Team"))
				.map(x -> x.split(" "))
				.collect(Collectors.toMap(x -> ((String[]) x)[1],
						x -> Math.abs(Integer.parseInt(((String[]) x)[6]) - Integer.parseInt(((String[]) x)[7]))));
		temp.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
		return (String) result.keySet().toArray()[0];
	}

}
