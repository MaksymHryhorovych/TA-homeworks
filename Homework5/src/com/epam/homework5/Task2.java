package com.epam.homework5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
        }

        int[] arrayPositive = new int[array.length];
        int[] arrayNegative = new int[array.length];

        int arrayPositiveCount = 0;
        int arrayNegativeCount = 0;

        for (int value : array) {
            if (value > 0) {
                arrayPositive[arrayPositiveCount] = value;
                arrayPositiveCount++;
            } else if (value < 0) {
                arrayNegative[arrayNegativeCount] = value;
                arrayNegativeCount++;
            }
        }

        arrayPositive = Arrays.copyOf(arrayPositive, arrayPositiveCount);
        arrayNegative = Arrays.copyOf(arrayNegative, arrayNegativeCount);

        System.out.println("Original: " + Arrays.toString(array) + "\nPositive: " + Arrays.toString(arrayPositive) + "\nNegative: " + Arrays.toString(arrayNegative));
    }
}
