package com.brideglabz.day13;

import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static int findMax(int num1, int num2, int num3) {
        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        scanner.close();

        int maxNumber = findMax(a, b, c);
        System.out.println("The maximum number is: " + maxNumber);
    }
}
