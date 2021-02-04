package com.maximumUsingGeneric;
//uc2 Stringing find max
public class FindMaximumNumber {

	public String FindMaxValue(String firstNumber, String secondNumber, String thirdNumber) {
		String max = firstNumber;
		if (secondNumber.compareTo(max) > 0) {
			max = secondNumber;
		}
		if (thirdNumber.compareTo(max) > 0) {
			max = thirdNumber;
		}
		printMax(max);
		return max;
	}

	private void printMax(String max) {
		System.out.println("Largest = " + max);
	}
}