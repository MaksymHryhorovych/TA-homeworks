package com.epam.task5;

public class Task5 {
    public static void main(String[] args) {
        int line = 1, symbolCounter = 1, maxLines = 10;
        while (line <= maxLines / 2) {
            int symbol = symbolCounter, space = (maxLines / 2) - line;
            while (space > 0) {
                System.out.print("  ");
                space--;
            }
            while (symbol > 0) {
                System.out.print("* ");
                symbol--;
            }
            line++;
            symbolCounter = symbolCounter + 2;
            System.out.println();
        }
        symbolCounter = 1;
        while (line > maxLines / 2 && line <= maxLines) {
            int symbol = symbolCounter, space = maxLines - line;
            while (space > 0) {
                System.out.print("  ");
                space--;
            }
            while (symbol > 0) {
                System.out.print("* ");
                symbol--;
            }
            line++;
            symbolCounter = symbolCounter + 2;
            System.out.println();
        }
    }
}
