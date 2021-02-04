package com.maximumUsingGeneric;

import java.util.Arrays;

//generic class and generic type variable
public class FindMaximumNumber<E extends Comparable<E>> {
	E[] values;

	@SafeVarargs
	public FindMaximumNumber(E... values) {
		this.values = values;
	}

	public E max() throws FindMaximumNumberException {
		if (values.length == 0) {
			throw new FindMaximumNumberException("No Elements to Compare for");
		} else {
			Arrays.sort(values);
			printMax(values[values.length - 1]);
			return values[values.length - 1];
		}
	}

	public void printMax(E value) {
		System.out.println("Max Value = " + value);
	}
}