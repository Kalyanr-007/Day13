package com.brideglabz.day13;   //UC4
import java.util.Scanner;
public class MaxOfMany<T extends Comparable<T>> {
    private T[] items;

    public MaxOfMany(T... items) {
        this.items = items;
    }

    public T findMax() {
        T max = items[0];

        for (int i = 1; i < items.length; i++) {
            if (items[i].compareTo(max) > 0) {
                max = items[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int count = scanner.nextInt();

        System.out.println("Enter the items:");
        String[] input = new String[count];
        for (int i = 0; i < count; i++) {
            input[i] = scanner.next();
        }

        scanner.close();

        MaxOfMany<String> maxFinder = new MaxOfMany<>(input);
        String maxItem = maxFinder.findMax();
        System.out.println("The maximum item is: " + maxItem);
    }
}



