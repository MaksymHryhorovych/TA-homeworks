package homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of money = ");
        int amount = scanner.nextInt();

        System.out.print("Enter number of months = ");
        int months = scanner.nextInt();

        final int PERCENT = 12;
        final int MONTHS_IN_YEAR = 12;
        double sum = amount;

        int counter = 1;
        while (counter <= months) {
            sum = sum + (sum * (PERCENT / MONTHS_IN_YEAR) / 100);
            counter++;
        }

        System.out.println((int)sum);
    }
}
