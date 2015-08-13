package ru.lesson.lessons;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1,1);
        Assert.assertEquals(2, calculator.getResult());
    }
    @Test
    public void testDiv() throws Exception {
        Calculator calculator = new Calculator();
        calculator.div(1,1);
        Assert.assertEquals(0, calculator.getResult());
    }
}