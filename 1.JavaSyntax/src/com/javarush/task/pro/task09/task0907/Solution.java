package com.javarush.task.pro.task09.task0907;

import javax.print.DocFlavor;
import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimale(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //напишите тут ваш код
        String result = "";
        if (decimalNumber <= 0) {
            return result;
        }
        StringBuilder stringBuilder = new StringBuilder(HEX);
        while (decimalNumber != 0) {
            result = stringBuilder.charAt(decimalNumber % 16) + result;
            decimalNumber = decimalNumber / 16;
        }
        return result;
    }

    public static int toDecimale(String hexNumber) {
        //напишите тут ваш код
        int result = 0;
        if (hexNumber == null) {
            return result;
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            result = 16 * result + HEX.indexOf(hexNumber.charAt(i));

        }
        return result;
    }
}
