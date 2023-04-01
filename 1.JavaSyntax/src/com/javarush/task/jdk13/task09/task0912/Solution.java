package com.javarush.task.jdk13.task09.task0912;

/* 
Исключение при работе с числами
*/

import java.text.ParseException;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        //напишите тут ваш код
    }
}
