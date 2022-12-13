package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        x = Math.sqrt(x);
        y = Math.sqrt(y);
        double rsl = x + y;
        return Math.sqrt(rsl);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double res = Point.distance(1, 1, 2, 2);
        System.out.println("result (1, 1) to (2, 2) " + res);
    }
}