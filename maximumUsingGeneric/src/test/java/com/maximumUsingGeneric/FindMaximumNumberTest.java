package com.maximumUsingGeneric;

import org.junit.Assert;
import org.junit.Test;
//generic class and generic type variable test
public class FindMaximumNumberTest {

	@Test
	public void givenFirstIntegerNumberAsLarge_ShouldReturn_FirstNumberAsMax() {
		Integer[] integerValues = { 50,35, 31 };
		Integer max = new FindMaximumNumber<>(integerValues).max();
		Assert.assertEquals((Integer) 50, max);
	}

	@Test
	public void givenSecondIntegerNumberAsLarge_ShouldReturn_SecondNumberAsMax() {
		Integer[] integerValues = { 2, 70, 5 };
		Integer max = new FindMaximumNumber<>(integerValues).max();
		Assert.assertEquals((Integer) 70, max);
	}

	@Test
	public void givenThirdIntegerNumberAsLarge_ShouldReturn_ThirdNumberAsMax() {
		Integer[] integerValues = { 5, 6, 30 };
		Integer max = new FindMaximumNumber<>(integerValues).max();
		Assert.assertEquals((Integer) 30, max);
	}

	@Test
	public void givenFirstFloatNumberAsLarge_ShouldReturn_FirstNumberAsMax() {
		Float[] floatValues = { 10.4f, 5.2f, 1.2f };
		Float max = new FindMaximumNumber<>(floatValues).max();
		Assert.assertEquals((Float) 10.4f, max);
	}

	@Test
	public void givenSecondFloatNumberAsLarge_ShouldReturn_SecondNumberAsMax() {
		Float[] floatValues = { 20.4f, 25.5f, 14.5f };
		Float max = new FindMaximumNumber<>(floatValues).max();
		Assert.assertEquals((Float) 25.5f, max);
	}

	@Test
	public void givenThirdFloatNumberAsLarge_ShouldReturn_ThirdNumberAsMax() {
		Float[] floatValues = { 4.5f, 13.5f, 40.6f };
		Float max = new FindMaximumNumber<>(floatValues).max();
		Assert.assertEquals((Float) 40.6f, max);
	}

	@Test
	public void givenFirstStringAsLarge_ShouldReturn_FirstStringAsMax() {
		String[] stringValues = { "mom", "eat", "dog" };
		String max = new FindMaximumNumber<>(stringValues).max();
		Assert.assertEquals("mom", max);
	}

	@Test
	public void givenSecondStringAsLarge_ShouldReturn_SecondStringAsMax() {
		String[] stringValues = { "hoal", "mam", "dim" };
		String max = new FindMaximumNumber<>(stringValues).max();
		Assert.assertEquals("mam", max);
	}

	@Test
	public void givenThirdStringAsLarge_ShouldReturn_ThirdStringAsMax() {
		String[] stringValues = { "hat", "Dad", "milk" };
		String max = new FindMaximumNumber<>(stringValues).max();
		Assert.assertEquals("milk", max);
	}
}