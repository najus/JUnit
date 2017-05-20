package com.najus.weather;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeatherData {

	public int findDayWithSmallestTemperatureSpread(String inputPath) {

		BufferedReader reader = readFromPath(inputPath);
		Map<Integer, Double> result = new LinkedHashMap<>();
		Stream<String> readerStream = reader.lines();
		List<String[]> streamOfArrays = readerStream
				.filter(x -> x.length() > 0)
				.map(x -> x.replaceAll("[ ]+", " "))
				.map(x -> x.replaceAll("\\*", ""))
				.filter(x -> !x.contains("Dy") && !x.contains("mo"))
				.map(x -> x.split(" "))
				.collect(Collectors.toList());
		Map<Integer, Double> temp = (Map<Integer, Double>) streamOfArrays.stream()
				.collect(Collectors.toMap(x -> Integer.parseInt(((String[]) x)[1]),
						y -> Double.parseDouble(((String[]) y)[2]) - Double.parseDouble(((String[]) y)[3])));
		temp.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
		return (int) result.keySet().toArray()[0];

	}

	public BufferedReader readFromPath(String inputPath) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(inputPath));
		} catch (FileNotFoundException e) {
			System.err.println("Check if the path is correct");
			e.printStackTrace();
		}
		return reader;
	}
}
