package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/

public class Solution {
    public static void main(String[] args) {
        print(12);
        print((Integer) 12);
    }

    //Напишите тут ваши методы
    public static void print (int value) {
        System.out.println(value);
    }
    public static void print (Integer value) {
        System.out.println(value);
    }
}
