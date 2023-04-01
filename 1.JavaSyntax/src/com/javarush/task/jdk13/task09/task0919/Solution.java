package com.javarush.task.jdk13.task09.task0919;

/* 
Деление на ноль
*/

import java.io.IOException;
import java.util.Random;

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void divideByZero() throws ArithmeticException {
        int x = 5 / 0;
        System.out.println(x);
    }
}
