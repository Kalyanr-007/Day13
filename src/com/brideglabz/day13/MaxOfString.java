package com.brideglabz.day13;

import java.util.Scanner;

public class MaxOfString {
    public static String findMax(String str1, String str2, String str3) {
        String max = str1;

        if (str2.compareTo(max) > 0) {
            max = str2;
        }

        if (str3.compareTo(max) > 0) {
            max = str3;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

        System.out.print("Enter the third string: ");
        String s3 = scanner.nextLine();

        scanner.close();

        String maxString = findMax(s1, s2, s3);
        System.out.println("The maximum string is: " + maxString);
    }
}
