package com.maximumUsingGeneric;

public class FindMaximumNumber {

	public <E extends Comparable> E FindMaxValue(E firstValue, E secondValue, E thirdValue){
		 E max = firstValue;
	        if (secondValue.compareTo(max) > 0) {
	            max = secondValue;
	        }
	        if (thirdValue.compareTo(max) > 0) {
	            max = thirdValue;
	        }
	       
	        return max;
	}

	 public <E> void printMax(E max){
	        System.out.println("Max Value = "+max);
	    }
	}
