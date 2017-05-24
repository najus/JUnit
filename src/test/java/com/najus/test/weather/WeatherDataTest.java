package com.najus.test.weather;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.najus.katas.weather.WeatherData;

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
