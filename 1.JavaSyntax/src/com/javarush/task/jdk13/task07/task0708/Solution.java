package com.javarush.task.jdk13.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самое большое число
*/

public class Solution {

    private static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxValue;
        for (int i = 0; i < 5; i++) {
            integers.add(Integer.parseInt(reader.readLine()));
        }
        maxValue = integers.get(0);
        for (int i = 1; i < integers.size(); i++) {
            if (integers.get(i) > maxValue) {
                maxValue = integers.get(i);
            }
        }
        System.out.println(maxValue);
        
    }
}
