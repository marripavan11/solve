package com.solve.problems;

public class FactorialUsingForLoop {

    public static void main(String[] args) {
        int factorial = factorial(10);
        System.out.println(factorial);
    }

    private static int factorial(int num) {
        int factorial = 1;
        if(num != 0) {
            for(int i=1; i<=num; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }
}
