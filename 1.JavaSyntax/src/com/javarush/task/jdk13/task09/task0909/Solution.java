package com.javarush.task.jdk13.task09.task0909;

/* 
Исключение при работе с массивами
*/

import java.net.SocketException;

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            int[] array = new int[2];
            array[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        //напишите тут ваш код
    }
}
