package com.najus.test.binaryrepresentation;

import org.junit.Test;

import com.najus.katas.binaryrepresentation.BinaryRepresentation;

import static org.junit.Assert.*;

public class BinaryRepresentationTest {

	@Test
	public void testBinaryConversionFor1000() {
		BinaryRepresentation binaryRep = new BinaryRepresentation();
		assertEquals(1111101000, binaryRep.convert(1000));
	}

	@Test
	public void maxBitRepresentationOf1000() {
		BinaryRepresentation binaryRep = new BinaryRepresentation();
		assertEquals(10, binaryRep.bitsRequiredForRepresentation(1000));
	}

}
