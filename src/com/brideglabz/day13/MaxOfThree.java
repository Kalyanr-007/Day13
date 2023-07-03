package com.brideglabz.day13;

    import java.util.Scanner;

    public class MaxOfThree<T extends Comparable<T>> {
        public static <T extends Comparable<T>> T findMax(T item1, T item2, T item3) {
            T max = item1;

            if (item2.compareTo(max) > 0) {
                max = item2;
            }

            if (item3.compareTo(max) > 0) {
                max = item3;
            }

            return max;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first item: ");
            String item1 = scanner.nextLine();

            System.out.print("Enter the second item: ");
            String item2 = scanner.nextLine();

            System.out.print("Enter the third item: ");
            String item3 = scanner.nextLine();

            scanner.close();

            String maxItem = findMax(item1, item2, item3);
            System.out.println("The maximum item is: " + maxItem);
        }
    }

}
