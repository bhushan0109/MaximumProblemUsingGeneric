package com.maximumUsingGeneric;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumNumberTest {
	FindMaximumNumber findMax = new FindMaximumNumber();

	// Test Case 1.1
	@Test
	public void givenFirstNumberAsLarge_Return_FirstNumberAsMax() {
		Float max = findMax.FindMaxValue(40.2f, 30.2f, 10.2f);
		Assert.assertEquals((Float) 40.2f, max);
	}

	// Test Case 1.2
	@Test
	public void givenSecondNumberAsLarge_Return_SecondNumberAsMax() {
		Float max = findMax.FindMaxValue(20.4f, 40.4f, 10.4f);
		Assert.assertEquals((Float) 40.4f, max);
	}

	// Test case 1.3
	@Test
	public void givenThirdNumberAsLarge_Return_ThirdNumberAsMax() {
		Float max = findMax.FindMaxValue(10.5f, 20.5f, 30.5f);
		Assert.assertEquals((Float) 30.5f, max);
	}
}