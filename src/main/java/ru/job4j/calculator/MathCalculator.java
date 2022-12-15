package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumAndSubDiv(10, 20));
        System.out.println("Результат расчета равен: " + sumAndSunDivSubMulti(10, 20));
    }

    public static double sumAndSubDiv(double first, double second) {
      return ru.job4j.math.MathFunction.sub(first, second)
              + ru.job4j.math.MathFunction.div(first, second);
    }

    public static double sumAndSunDivSubMulti(double first, double second) {
        return ru.job4j.math.MathFunction.div(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second)
                + ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.sub(first, second);
    }

}

