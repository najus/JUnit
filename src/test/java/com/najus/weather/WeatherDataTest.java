package com.najus.weather;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class WeatherDataTest {
	private final String inputPath = "resources/weather.dat";
	WeatherData wData;

	@Before
	public void setUp() {
		wData = new WeatherData();
	}

	@Test
	public void checkIfDataIsRead() {
		assertNotNull(wData.readFromPath(inputPath));
	}

	@Test
	public void getTheDayForSmallestTemperatureSpread() {

		assertEquals(14, wData.findDayWithSmallestTemperatureSpread(inputPath));
	}

}
