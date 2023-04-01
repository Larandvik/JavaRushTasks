package com.javarush.task.jdk13.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Сортировка списка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        String irregular = list.get(0);
        int index = 1;
        for (int i = 1; i < list.size(); i++) {
            if (irregular.length() <= list.get(i).length()) {
                irregular = list.get(i);
                index++;
            } else {
                System.out.println(index);
                break;
            }

        }
    }
}

