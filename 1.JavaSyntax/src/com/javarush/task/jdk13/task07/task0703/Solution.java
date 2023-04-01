package com.javarush.task.jdk13.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Два массива
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] family = new String[10];
        int[] values = new int[10];

        for (int i = 0; i < family.length; i++) {
            family[i] = reader.readLine();
        }
        for (int i = 0; i < family.length; i++) {
            values[i] = (family[i].length());
        }
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
