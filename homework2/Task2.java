package homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter number of pounds = ");
        Scanner scanner = new Scanner(System.in);
        int pounds = scanner.nextInt();

        double POUND = 453.6;
        double grams = pounds * POUND;
        int kilogram = (int) grams / 1000;
        int gram = (int) grams - kilogram * 1000;

        System.out.println("Kilograms = " + kilogram + "\nGrams = " + gram);
    }
}
