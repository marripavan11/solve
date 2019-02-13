package com.solve.problems;

import java.util.Arrays;
import java.util.Scanner;

public class TurboSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = scanner.nextInt();

        int inputs[] = new int[numberOfInputs];

        for(int i=0; i<numberOfInputs; i++) {
            inputs[i] = scanner.nextInt();
        }

        Arrays.sort(inputs);

        for (int input : inputs) {
            System.out.println(input);
        }
    }
}
