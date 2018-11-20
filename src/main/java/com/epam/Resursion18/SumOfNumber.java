package com.epam.Resursion18;

public class SumOfNumber {
    /**
     * Write recursion function for get sum of number
     */
    public  int getSumOfNumber(int n) {
        return (n > 0) ? n % 10 + getSumOfNumber(n / 10) : 0;
    }
}