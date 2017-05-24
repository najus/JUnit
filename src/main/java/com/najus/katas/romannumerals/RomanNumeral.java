package com.najus.katas.romannumerals;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

	private static Map<String, Integer> romanArabicMap = new HashMap<>();

	static {
		romanArabicMap.put("I", 1);
		romanArabicMap.put("V", 5);
	}

	public int getArabic(String inputRomanNumber) {
		if (inputRomanNumber.length() == 1)
			return (romanArabicMap.get(inputRomanNumber));
		else
			return (romanArabicMap.get(inputRomanNumber.substring(0, 1)) + getArabic(inputRomanNumber.substring(1)));
	}

}
