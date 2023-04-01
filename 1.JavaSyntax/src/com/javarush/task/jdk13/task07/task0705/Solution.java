package com.javarush.task.jdk13.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] bigArray = new int[20];
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < bigArray.length; i++) {
            String value = reader.readLine();
            bigArray[i] = Integer.parseInt(value);
        }

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        System.arraycopy(bigArray, 0, array1, 0, 10);
        System.arraycopy(bigArray, 10, array2, 0, 10);

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
