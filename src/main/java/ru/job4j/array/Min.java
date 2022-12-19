package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[0] > array[index]) {
                min = array[index];
                array[0] = min;
            }
        }
        return min;
    }
}