package com.javarush.task.jdk13.task07.task0715;

import java.sql.Array;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>(3);

        list.add("мама");
        list.add("мыла");
        list.add("раму");

        list.add(1,"именно");
        list.add(3,"именно");
        list.add(5,"именно");

        for (String string : list) {
            System.out.println(string);
        }
    }

}
