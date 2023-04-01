package com.javarush.task.jdk13.task05.task0514;

/* 
Инициализация объектов
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person person = new Person();
        person.initialize("Andrew", 32);
    }

    static class Person {
        //напишите тут ваш код
        private String name;
        private int age;

        public void initialize (String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
