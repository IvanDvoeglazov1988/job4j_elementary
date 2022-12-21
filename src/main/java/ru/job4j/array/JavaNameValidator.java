package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty()) {
            return false;
        }
        for (int i = 1; i < name.length(); i++) {
            int codeP = name.codePointAt(0);
            char sim = name.charAt(0);
            if (Character.isUpperCase(sim)) {
                return false;
            } else if (isSpecialSymbol(codeP) || isUpperLatinLetter(codeP) || isLowerLatinLetter(codeP)) {
                return true;
            }
        }
        return false;
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


