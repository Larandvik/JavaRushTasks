package com.javarush.task.jdk13.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая короткая строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        String minString = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() < minString.length()) {
                minString = list.get(i);
            }
        }
        System.out.println(minString);

        for (int i = 0; i < list.size(); i++) {
            if (minString.length() == list.get(i).length() && minString != list.get(i)) {
                System.out.println(list.get(i));
            }
        }

    }
}
