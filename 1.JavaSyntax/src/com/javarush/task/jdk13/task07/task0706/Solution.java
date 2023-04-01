package com.javarush.task.jdk13.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улица и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] houses = new int[15];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < houses.length; i++) {
            houses[i] = Integer.parseInt(reader.readLine());
        }
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < houses.length; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + houses[i];
            } else {
                oddSum = oddSum + houses[i];
            }
        }
        if (oddSum == evenSum) {
            return;
        } else if (evenSum > oddSum) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else if (oddSum > evenSum) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
