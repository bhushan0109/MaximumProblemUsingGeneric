package com.maximumUsingGeneric;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumNumberTest {
	FindMaximumNumber findMax = new FindMaximumNumber();

	// Test Case 1.1
	@Test
	public void givenFirstNumberAsLarge_Return_FirstNumberAsMax() {
		Integer max = findMax.FindMaxValue(40, 30, 10);
		Assert.assertEquals((Integer) 40, max);
	}

	// Test Case 1.225
	@Test
	public void givenSecondNumberAsLarge_Return_SecondNumberAsMax() {
		Integer max = findMax.FindMaxValue(20, 40, 10);
		Assert.assertEquals((Integer) 40, max);
	}

	// Test case 1.3
	@Test
	public void givenThirdNumberAsLarge_Return_ThirdNumberAsMax() {
		Integer max = findMax.FindMaxValue(10, 20, 30);
		Assert.assertEquals((Integer) 30, max);
	}

	// Test Case 1.1
	@Test
	public void givenFirstNumberAsLarge_Return_FirstNumberAsMax_float() {
		Float max = findMax.FindMaxValue(40.2f, 30.2f, 10.2f);
		Assert.assertEquals((Float) 40.2f, max);
	}

	// Test Case 1.2
	@Test
	public void givenSecondNumberAsLarge_Return_SecondNumberAsMax_float() {
		Float max = findMax.FindMaxValue(20.4f, 40.4f, 10.4f);
		Assert.assertEquals((Float) 40.4f, max);
	}

	// Test case 1.3
	@Test
	public void givenThirdNumberAsLarge_Return_ThirdNumberAsMax_float() {
		Float max = findMax.FindMaxValue(10.5f, 20.5f, 30.5f);
		Assert.assertEquals((Float) 30.5f, max);
	}

	// Test Case 1.1
	@Test
	public void givenFirstNumberAsLarge_Return_FirstNumberAsMax_string() {
		String max = findMax.FindMaxValue("zyan", "vas", "patil");
		Assert.assertEquals((String) "zyan", max);
	}

	// Test Case 1.2
	@Test
	public void givenSecondNumberAsLarge_Return_SecondNumberAsMax_string() {
		String max = findMax.FindMaxValue("das", "syam", "jou");
		Assert.assertEquals((String) "syam", max);
	}

	// Test case 1.3
	@Test
	public void givenThirdNumberAsLarge_Return_ThirdNumberAsMax_string() {
		String max = findMax.FindMaxValue("bhu", "dipak", "rajkumar");
		Assert.assertEquals((String) "rajkumar", max);
	}
}