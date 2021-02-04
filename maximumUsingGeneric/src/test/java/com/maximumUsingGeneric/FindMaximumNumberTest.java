package com.maximumUsingGeneric;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumNumberTest {
  FindMaximumNumber findMax = new FindMaximumNumber();

    //Test Case 1.1
    @Test
    public void givenFirstNumberAsLarge_Return_FirstNumberAsMax() {
        Integer max = findMax.FindMaxValue(40, 30, 10);
        Assert.assertEquals((Integer) 40, max);
    }

    //Test Case 1.225
    @Test
    public void givenSecondNumberAsLarge_Return_SecondNumberAsMax() {
        Integer max = findMax.FindMaxValue(20, 40, 10);
        Assert.assertEquals((Integer) 40, max);
    }

    //Test case 1.3
    @Test
    public void givenThirdNumberAsLarge_Return_ThirdNumberAsMax() {
        Integer max = findMax.FindMaxValue(10, 20, 30);
        Assert.assertEquals((Integer) 30, max);
    }
}