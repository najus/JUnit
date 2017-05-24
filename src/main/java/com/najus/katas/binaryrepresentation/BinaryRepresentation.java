package com.najus.katas.binaryrepresentation;

public class BinaryRepresentation {
	private StringBuilder sb = new StringBuilder();

	public long convert(int input) {
		int remainder;
		if (input <= 1) {
			sb.append(input);
			return input;
		}
		remainder = input % 2;
		convert(input >> 1);
		sb.append(remainder);
		return Long.parseLong(sb.toString());
	}

	public int bitsRequiredForRepresentation(int input) {
		return String.valueOf(convert(input)).length();
	}

}
