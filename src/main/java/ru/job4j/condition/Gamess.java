package ru.job4j.condition;

public class Gamess {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the computer club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Gamess.permission(true, true);
        Gamess.permission(true, false);
        Gamess.permission(false, true);
        Gamess.permission(false, false);
    }
}