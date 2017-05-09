package com.najus.converter;

public class CurrencyConverter {

	private static final String[] specialNames = { "", " thousand", " million", " billion", " trillion", " quadrillion",
			" quintillion" };

	private static final String[] tensNames = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
			" seventy", " eighty", " ninety" };

	private static final String[] numNames = { "", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" };

	private String convertLessThanOneThousand(int number) {
		String current;

		if (number % 100 < 20) {
			current = numNames[number % 100];
			number /= 100;
		} else {
			current = numNames[number % 10];
			number /= 10;

			current = tensNames[number % 10] + current;
			number /= 10;
		}
		if (number == 0)
			return current;
		return numNames[number] + " hundred" + current;
	}

	public String convert(int num) {
		String current = "";
		int place = 0;

		if (num == 0)
			return "zero";
		do {
			int n = num % 1000;
			if (n != 0) {
				String temp = convertLessThanOneThousand(n);
				current = temp + specialNames[place] + current;
			}
			place++;
			num /= 1000;
		} while (num > 0);
		return current.trim();
	}

}
