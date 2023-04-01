package com.javarush.task.jdk13.task09.task0918;

/* 
Создаем свои исключения
*/

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends Error{
    }

    static class MyException2 extends Error{
    }

    static class MyException3 extends Exception{
    }

    static class MyException4 extends Exception{
    }
}

