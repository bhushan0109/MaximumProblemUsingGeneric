package com.maximumUsingGeneric;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
	// OBJECT
	Maximum findMaximum = new Maximum();

	// TEST CASE 1.1

	@Test
	public void givenThreeIntegers_WhenMaximumFoundAtPosition1_ThenReturnMaximum() {
		Integer maximumInteger = findMaximum.findMaximumInteger(1, 2, 3);
		Assert.assertEquals((Integer) 3, maximumInteger);
	}

	// TEST CASE 1.2
	@Test
	public void givenThreeIntegers_WhenMaximumFoundAtPosition2_ThenReturnMaximum() {
		Integer maximumInteger = findMaximum.findMaximumInteger(3, 2, 1);
		Assert.assertEquals((Integer) 3, maximumInteger);
	}

	// TEST CASE 1.3
	@Test
	public void givenThreeIntegers_WhenMaximumFoundAtPosition3_ThenReturnMaximum() {
		Integer maximumInteger = findMaximum.findMaximumInteger(3, 1, 2);
		Assert.assertEquals((Integer) 3, maximumInteger);
	}
}
