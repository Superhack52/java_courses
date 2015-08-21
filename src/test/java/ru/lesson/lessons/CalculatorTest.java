package ru.lesson.lessons;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1, 1);
        Assert.assertEquals(2, calculator.getResult());
    }

    @Test(expected = UserException.class)
    public void divException() throws UserException {
        Calculator calculator = new Calculator();
        calculator.div();
        Assert.assertEquals(0, calculator.getResult());
    }

    @Test(expected = UserException.class)
    public void div() throws UserException {
        Calculator calculator = new Calculator();
        calculator.div();
    }

    @Test(expected = IllegalArgumentException.class)
    public void divRuntimeException() throws UserException {
        Calculator calculator = new Calculator();
        calculator.div(1, 0);
        Assert.assertEquals(0, calculator.getResult());
    }
}