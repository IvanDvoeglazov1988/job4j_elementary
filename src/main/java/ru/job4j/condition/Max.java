package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int three) {
        return max(first, max(second, three));
    }

    public static int max(int first, int second, int three, int four) {
        return max(max(first, second), max(three, four));
    }
}
