package com.najus.football;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FootballData {

	public BufferedReader readData(String inputPath) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(inputPath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return reader;
	}

}
