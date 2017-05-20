package com.najus.football;

import org.junit.Test;
import static org.junit.Assert.*;

public class FootballDataTest {

	private final String inputPath = "resources/football.dat";

	@Test
	public void testIfTheDataIsReadCorrectly() {
		FootballData footballData = new FootballData();
		assertNotNull(footballData.readData(inputPath));
	}

}
