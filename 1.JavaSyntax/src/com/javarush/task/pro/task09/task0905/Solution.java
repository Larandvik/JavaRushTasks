package com.javarush.task.pro.task09.task0905;
import java.util.regex.Pattern;

/* 
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишите тут ваш код
        if (decimalNumber <= 0){
            return 0;
        }
        int i = 0;
        double octalNumber = 0;
        while (decimalNumber != 0) {
            octalNumber = octalNumber + (decimalNumber % 8) * Math.pow(10,i);
            decimalNumber = decimalNumber / 8;
            i++;
        }
        int octalNumberInt = (int)octalNumber;
        return octalNumberInt;

    }

    public static int toDecimal(int octalNumber) {
        //напишите тут ваш код
        if (octalNumber <= 0){
            return 0;
        }
        double decemalNumber = 0;
        int i = 0;
        while (octalNumber != 0) {
            decemalNumber = decemalNumber + (octalNumber % 10) * Math.pow(8,i);
            octalNumber = octalNumber / 10;
            i++;
        }
        int decemalNumberInt = (int)decemalNumber;
        return decemalNumberInt;

    }
}
