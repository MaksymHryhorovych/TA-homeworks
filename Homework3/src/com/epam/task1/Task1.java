package com.epam.task1;

public class Task1 {
    public static void main(String[] args) {
        int line = 1;
        while (line <=5) {
            int number = line;
            while (number > 0) {
                System.out.print("* ");
                number--;
            }
            line++;
            System.out.println();
        }
        while (line > 5 && line <=10) {
            int number = 10 - line;
            while (number > 0) {
                System.out.print("* ");
                number--;
            }
            line++;
            System.out.println();
        }
    }
}