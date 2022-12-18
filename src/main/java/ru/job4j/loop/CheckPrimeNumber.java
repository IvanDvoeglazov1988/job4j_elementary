package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        if (number % 2 == 1 && number > 1) {
             prime = true;
         }
        return prime;
    }
}