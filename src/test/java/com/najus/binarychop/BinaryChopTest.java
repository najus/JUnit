package com.najus.binarychop;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class BinaryChopTest {

	BinaryChop bChop;
	int[] arrayOfIntegers = { 1, 2, 3, 4, 5 };

	@Before
	public void setUp() {
		bChop = new BinaryChop();
	}

	@Test
	public void searchIntegerInFirstPosition() {
		assertEquals(0, bChop.search(1, arrayOfIntegers));
		assertEquals(0, bChop.searchRecursive(1, arrayOfIntegers));
	}

	@Test
	public void searchIntegerInLastPosition() {
		assertEquals(4, bChop.search(5, arrayOfIntegers));
		assertEquals(4, bChop.searchRecursive(5, arrayOfIntegers));
	}

	@Test
	public void searchIntegerWhichIsNotInInput() {
		assertEquals(-1, bChop.search(6, arrayOfIntegers));
		assertEquals(-1, bChop.searchRecursive(6, arrayOfIntegers));
	}

}
