package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumAndSubDiv(10, 20));
        System.out.println("Результат расчета равен: " + sumAndSumDivSubMulti(10, 20));
    }

    public static double sumAndSubDiv(double first, double second) {
      return MathFunction.sub(first, second)
              + MathFunction.div(first, second);
    }

    public static double sumAndSumDivSubMulti(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.div(first, second)
                + MathFunction.sub(first, second)
                + MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }
}

