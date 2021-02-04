package com.maximumUsingGeneric;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumNumberTest {
	FindMaximumNumber findMax = new FindMaximumNumber();

	// Test Case 1.1
	@Test
	public void givenFirstNumberAsLarge_Return_FirstNumberAsMax() {
		String max = findMax.FindMaxValue("zyan", "vas", "patil");
		Assert.assertEquals((String) "zyan", max);
	}

	// Test Case 1.2
	@Test
	public void givenSecondNumberAsLarge_Return_SecondNumberAsMax() {
		String max = findMax.FindMaxValue("das", "syam", "jou");
		Assert.assertEquals((String) "syam", max);
	}

	// Test case 1.3
	@Test
	public void givenThirdNumberAsLarge_Return_ThirdNumberAsMax() {
		String max = findMax.FindMaxValue("bhu", "dipak", "rajkumar");
		Assert.assertEquals((String) "rajkumar", max);
	}
}