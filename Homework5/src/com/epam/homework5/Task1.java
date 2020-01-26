package com.epam.homework5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }

        int[] array2 = new int[array1.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);
        }

        int[] arraySum = new int[array2.length];
        for (int i = 0; i < arraySum.length; i++) {
            arraySum[i] = array1[i] + array2[i];
        }

        System.out.println(Arrays.toString(array1) + "\n" + Arrays.toString(array2) + "\n" + Arrays.toString(arraySum) );
    }
}
