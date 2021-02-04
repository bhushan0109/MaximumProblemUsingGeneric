package com.maximumUsingGeneric;
//uc2 floating find max
public class FindMaximumNumber {

	public Float FindMaxValue(Float firstNumber, Float secondNumber, Float thirdNumber) {
		Float max = firstNumber;
		if (secondNumber.compareTo(max) > 0) {
			max = secondNumber;
		}
		if (thirdNumber.compareTo(max) > 0) {
			max = thirdNumber;
		}
		printMax(max);
		return max;
	}

	private void printMax(Float max) {
		System.out.println("Largest = " + max);
	}
}