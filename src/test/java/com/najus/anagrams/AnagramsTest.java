package com.najus.anagrams;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.hamcrest.collection.IsMapContaining;
import org.junit.Test;

public class AnagramsTest {

	private static final String RESOURCES_WORDS_TXT = "resources/words.txt";

	@Test
	public void testKinshipAnagram() {
		Anagram anagram = new Anagram(RESOURCES_WORDS_TXT);
		List<String> expectedList = new ArrayList<String>(Arrays.asList("kinship", "pinkish"));
		Map<String, List<String>> allAnagrams = anagram.getAllAnagrams();
		assertThat(allAnagrams, IsMapContaining.hasValue(expectedList));
	}

}
