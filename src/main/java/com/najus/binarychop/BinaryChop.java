package com.najus.binarychop;

public class BinaryChop {

	public int search(int searchTarget, int[] inputArray) {
		int lower = 0;
		int upper = inputArray.length - 1;
		while (lower <= upper) {
			int midPoint = (lower + upper) / 2;
			if (searchTarget == inputArray[midPoint]) {
				return midPoint;
			} else if (searchTarget < inputArray[midPoint]) {
				upper = midPoint - 1;
			} else {
				lower = midPoint + 1;
			}

		}
		return -1;

	}

}
