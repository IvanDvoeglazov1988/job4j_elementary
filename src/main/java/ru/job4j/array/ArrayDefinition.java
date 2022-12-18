package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Petya";
        names[1] = "Semen";
        names[2] = "Elena";
        names[3] = "Marina";
        System.out.println("Произвольное имя: " + names[0]);
        System.out.println("Произвольное имя: " + names[1]);
        System.out.println("Произвольное имя: " + names[2]);
        System.out.println("Произвольное имя: " + names[3]);
    }
}
