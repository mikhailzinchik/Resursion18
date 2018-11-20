package com.epam.Recursion18;

import org.junit.Test;
import com.epam.Resursion18.CountOfNumber;
import com.epam.Resursion18.Exponentiation;
import com.epam.Resursion18.Factorial;
import com.epam.Resursion18.SumOfNumber;
import static org.junit.Assert.assertEquals;

public class RecursionTest {
    @Test
    public void testFactorial() {
        Factorial fact = new Factorial();
        assertEquals(1, fact.fact(0));
        assertEquals(6, fact.fact(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorial_throws() {
        Factorial fact = new Factorial();
        fact.fact(-1);
    }

    @Test
    public void testPower() {
        Exponentiation exp =new Exponentiation();
        assertEquals(25, exp.power(5, 2), 10E-10);
        assertEquals(6.25, exp.power(2.5, 2), 10E-10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPower_throws() {
        Exponentiation exp =new Exponentiation();
        exp.power(3, -1);
    }

    @Test
    public void testGetSumOfNumber() {
        SumOfNumber sum= new SumOfNumber();
        assertEquals(1, sum.getSumOfNumber(100000));
        assertEquals(15, sum.getSumOfNumber(21354));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSumOfNumber_throws() {
        SumOfNumber sum= new SumOfNumber();
        sum.getSumOfNumber(-1);
    }

    @Test
    public void testGetCountOfNumber() {
        CountOfNumber count= new CountOfNumber();
        assertEquals(4, count.getCountOfNumber(1000));
        assertEquals(2, count.getCountOfNumber(16));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCountOfNumber_throws() {
        CountOfNumber count= new CountOfNumber();
        count.getCountOfNumber(-2);
    }
}