package com.maximumUsingGeneric;

public class FindMaximumNumber<E extends Comparable<E>> {
	E[] values;

	public FindMaximumNumber(E[] values) {
		this.values = values;
	}

	public static <E> void printMax(E max) {
		System.out.println("Max Value = " + max);
	}

	public E max() {
		if (values[0].compareTo(values[1]) > 0 && values[0].compareTo(values[2]) > 0) {
			printMax(values[0]);
			return values[0];
		} else if (values[1].compareTo(values[0]) > 0 && values[1].compareTo(values[2]) > 0) {
			printMax(values[1]);
			return values[1];
		} else {
			printMax(values[2]);
			return values[2];
		}
	}
}