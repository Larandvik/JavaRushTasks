package com.javarush.task.jdk13.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        list.remove(2);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(list.size() - i - 1));
        }
    }
}
