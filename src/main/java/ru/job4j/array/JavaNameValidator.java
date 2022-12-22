package ru.job4j.array;

import java.util.Arrays;

import static java.lang.Character.*;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty() || isUpperCase(name.codePointAt(0)) || isDigit(name.codePointAt(0))) {
            return false;
        }
        for (int i = 1; i < name.length(); i++) {
            int codeP = name.codePointAt(i);
            if (!(isSpecialSymbol(codeP) || isUpperLatinLetter(codeP) || isLowerLatinLetter(codeP) || isDigit(codeP))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }

}

