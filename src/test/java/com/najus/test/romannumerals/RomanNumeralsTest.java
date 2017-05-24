package com.najus.test.romannumerals;

import org.junit.Test;

import com.najus.katas.romannumerals.RomanNumeral;

import static org.junit.Assert.*;

import org.junit.Before;

public class RomanNumeralsTest {
	RomanNumeral romanNumeral;

	@Before
	public void setUp() {
		romanNumeral = new RomanNumeral();
	}

	@Test
	public void testRomanNumeralForI() {

		assertEquals(1, romanNumeral.getArabic("I"));
		assertEquals(2, romanNumeral.getArabic("II"));
		assertEquals(3, romanNumeral.getArabic("III"));
	}

	@Test
	public void testRomanNumeralForV() {
		assertEquals(5, romanNumeral.getArabic("V"));
		assertEquals(6, romanNumeral.getArabic("VI"));
	}

}
