package com.javarush.task.jdk13.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимальное или максимальное
*/

public class Solution {

    public static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        int minIndex = 0;
        String minString = strings.get(0);
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).length() < minString.length()) {
                minString = strings.get(i);
                minIndex = i;
            }
        }
        int maxIndex = 0;
        String maxString = strings.get(0);
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).length() > maxString.length()) {
                maxString = strings.get(i);
                maxIndex = i;
            }
        }
        if (maxIndex < minIndex) {
            System.out.println(maxString);
        } else System.out.println(minString);
    }
}
