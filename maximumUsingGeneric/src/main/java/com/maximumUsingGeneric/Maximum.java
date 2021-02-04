package com.maximumUsingGeneric;

public class Maximum {
	// TO METHOD
	public static Integer findMaximumInteger(Integer oneValue, Integer twoValue, Integer threeValue) {
		Integer maximumValue = oneValue;
		if (oneValue.compareTo(maximumValue) > 0)
			maximumValue = twoValue;
		if (threeValue.compareTo(maximumValue) > 0)
			maximumValue = threeValue;
		return maximumValue;
	}

	// TO MAIN METHOD AND CREATE OBJECT AND OBJECT CALL
	public static void main(String[] args) {
		System.out.println("WELCOME TEST MAXIMUM AND GENERIC");
		Maximum maximum = new Maximum();
	}

}