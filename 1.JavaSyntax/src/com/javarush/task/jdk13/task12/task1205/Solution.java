package com.javarush.task.jdk13.task12.task1205;

/* 
А мне так нужно
*/

public class Solution {

    private static String UNEXPECTED_TYPE = "Я такого типа числа не жду!";

    public static void main(String[] args) {
        System.out.println(toCustomString((byte) 12));
        System.out.println(toCustomString(12));
        System.out.println(toCustomString(12.));
        System.out.println(toCustomString(12L));
    }

    public static String toCustomString(Number number) {
        //напишите тут ваш код
        String result;
        if (number instanceof Byte) {
            number = (Byte) number / 2;
            result = number + "b";
        } else if (number instanceof Integer) {
            result = (Integer) number / 3 + "";
        } else if (number instanceof Double) {
            result = (Double) number * 20 + "";
        } else result = UNEXPECTED_TYPE;

        return result;
    }
}
