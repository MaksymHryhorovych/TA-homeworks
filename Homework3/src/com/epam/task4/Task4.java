package com.epam.task4;

public class Task4 {
    public static void main(String[] args) {
        int line = 1, maxLines = 10;
        while (line <= maxLines / 2) {
            int stars = line, space = (maxLines / 2) - stars;
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
        while (line > maxLines / 2 && line <= maxLines) {
            int stars = maxLines - line, space = line - (maxLines / 2);
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
