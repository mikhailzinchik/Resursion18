package com.epam.Resursion18;

/**
 * Taks 10.41
 * Write recursive function for calculating the factorial of a natural number 'n'
 * Task 10.42
 * Write a recursive function to calculate the degree of 'a' for a natural number 'n'
 * Task 10.43a
 * Write recursive function to calculate the sum of digits of a natural number 'n'
 * Task 10.43b
 * Write recursive function to calculate the number of digits of a natural number 'n'
 */
public class Main {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        Exponentiation exp =new Exponentiation();
        SumOfNumber sum= new SumOfNumber();
        CountOfNumber count= new CountOfNumber();
        System.out.println("Fact of 5: " + fact.fact(5));
        System.out.println("Number '2' in exp '5' is:" + exp.power(2,5));
        System.out.println("The sum of all digits of 25 is  " + sum.getSumOfNumber(25));
        System.out.println("The number of digits in the natural number 10154 is " + count.getCountOfNumber(10154));
    }
}