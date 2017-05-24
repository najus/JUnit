package com.najus.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.najus.katas.converter.UnrepeatedLetter;

import static org.junit.Assert.*;

public class UnrepeatedLetterTest {

	UnrepeatedLetter uLetter;

	@Before
	public void setup() {
		uLetter = new UnrepeatedLetter();
	}

	@Test
	public void test() {
		char unrepeatedR = uLetter.findFirstUnrepeatedLetter("teeter");
		char unrepeatedQ = uLetter.findFirstUnrepeatedLetter("aabsdfhadsjqajpkdfabfyaadsfhzxcmm");
		assertEquals('r', unrepeatedR);
		assertEquals('q', unrepeatedQ);
	}

	@After
	public void close() {

	}
}
