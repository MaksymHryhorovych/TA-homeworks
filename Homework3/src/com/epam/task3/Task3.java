package com.epam.task3;

public class Task3 {
    public static void main(String[] args) {
        int line = 1, maxLines = 5;
        while (line <= maxLines) {
            int stars = line, space = maxLines - stars;
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
