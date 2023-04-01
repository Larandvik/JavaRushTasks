package com.javarush.task.jdk13.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
10 строчек в начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(0, reader.readLine());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }





    }
}
