package com.javarush.task.jdk13.task09.task0910;

import java.util.ArrayList;

/* 
Исключение при работе с коллекциями List
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }


        //напишите тут ваш код
    }
}