package com.javarush.task.jdk13.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Массив из строк в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] family = new String[10];
//        заполнение массива
        for (int i = 0; i < 8; i++) {
            family[i] = reader.readLine();
        }
//        вывод на экран
        for (int i = family.length - 1; i >= 0; i--) {
            System.out.println((family[i]));
        }
    }
}