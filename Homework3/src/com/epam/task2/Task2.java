package com.epam.task2;

public class Task2 {
    public static void main(String[] args) {
        int line = 1, maxLines = 5;
        while (line <= maxLines) {
            int stars = maxLines, space = line - 1;
            while (space > 0) {
                System.out.print("  ");
                space--;
            }
            while (stars > 0) {
                System.out.print("* ");
                stars--;
            }
            line++;
            System.out.println();
        }
    }
}
