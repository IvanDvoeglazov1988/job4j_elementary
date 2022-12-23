package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int three) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (three > max) {
            max = three;
        }
        return max;
    }

    public static int max(int first, int second, int three, int four) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (three > max) {
            max = three;
        }
        if (four > max) {
            max = four;
        }
        return max;
    }
}
