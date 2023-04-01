package com.javarush.task.jdk13.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из чисел в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] values = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < values.length; i++) {
            String value = reader.readLine();
            values[i] = Integer.parseInt(value);
        }

        for (int i = values.length -1; i >= 0; i--) {
            System.out.println(values[i]);
        }
    }
}

