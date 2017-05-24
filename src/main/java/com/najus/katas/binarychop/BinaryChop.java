package com.najus.katas.binarychop;

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

	public int searchRecursive(int searchTarget, int[] inputArray) {
		return binarySearchRecursive(searchTarget, 0, inputArray.length - 1, inputArray);

	}

	private int binarySearchRecursive(int searchTarget, int start, int end, int[] inputArray) {
		int midPoint = (start + end) / 2;
		if (end < start)
			return -1;

		if (searchTarget == inputArray[midPoint]) {
			return midPoint;
		} else if (searchTarget < inputArray[midPoint]) {
			return binarySearchRecursive(searchTarget, start, midPoint - 1, inputArray);
		} else {
			return binarySearchRecursive(searchTarget, midPoint + 1, end, inputArray);
		}
	}

}
