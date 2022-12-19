package ru.job4j.array;

import static ru.job4j.array.MinDiapason.*;
import static ru.job4j.array.FindLoop.*;
import static ru.job4j.array.SwitchArray.*;

public class SortSelected {

    public static int[] sort(int[] data) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            int min = findMin(data, i, data.length - 1);
            int index = indexInRange(data, min, i, data.length - 1);
            result = swap(data, index, i);
        }
        return result;
    }
}