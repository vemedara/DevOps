package com.devops;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calculatorObject = new Calculator();

    @Test
    public void addTest(){
        int result = calculatorObject.add(1,1);
        Assert.assertEquals(result,2);
    }

    @Test
    public void subTest(){
        int result = calculatorObject.sub(1,1);
        Assert.assertEquals(result,0);
    }

    @Test
    public void mulTest(){
        int result = calculatorObject.mul(1,1);
        Assert.assertEquals(result,1);
    }

    @Test
    public void divTest(){
        int result = calculatorObject.div(1,1);
        Assert.assertEquals(result,1);
    }

}
