package com.najus.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.najus.converter.CurrencyConverter;

public class CurrencyTest {

	CurrencyConverter converter;

	@Before
	public void setup() {
		converter = new CurrencyConverter();
	}

	@Test
	public void testConversion() {
		assertEquals("zero", converter.convert(0));
		assertEquals("twenty five", converter.convert(25));
	}

	@After
	public void complete() {

	}

}
