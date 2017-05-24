package com.najus.test.football;

import org.junit.Test;

import com.najus.katas.football.FootballData;

import static org.junit.Assert.*;

import org.junit.Before;

public class FootballDataTest {

	FootballData footballData;
	private final String inputPath = "resources/football.dat";

	@Before
	public void setUp() {
		footballData = new FootballData(inputPath);
	}

	@Test
	public void testIfTheDataIsReadCorrectly() {
		assertNotNull(footballData.readData());
	}

	@Test
	public void testTheTeamWithSmallestGoalDifference() {
		assertEquals("Aston_Villa", footballData.getTeamHavingSmallestGoalDifference());
	}

}
