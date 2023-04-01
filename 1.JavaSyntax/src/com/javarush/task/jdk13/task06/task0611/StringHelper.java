package com.javarush.task.jdk13.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {


    public static String multiply(String text) {
        String result = "";
        //напишите тут ваш код
        for (int i = 0; i < 5; i++) {
            result = result + text;
        }
        return result;
    }

    public static String multiply(String text, int count) {
        String result = "";
        //напишите тут ваш код
        for (int i = 0; i < count; i++) {
            result = result + text;
        }
        return result;
    }

    public static void main(String[] args) {
        multiply("helloAmigo");
        multiply("hello", 8);

    }
}
