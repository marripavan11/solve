package com.solve.problems;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        int factorialNumber = factorial(10);
        System.out.println(factorialNumber);
    }

    private static int factorial(int num) {
        if(num == 0) {
            return 1;
        }
        return num * factorial(num-1);
    }
}
