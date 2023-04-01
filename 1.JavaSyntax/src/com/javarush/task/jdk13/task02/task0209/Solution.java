package com.javarush.task.jdk13.task02.task0209;

/* 
Три собаки - это сила
*/

public class Solution {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Max";

        //напишите тут ваш код
        Dog dog2 = new Dog();
        dog2.name = "Bella";

        Dog dog3 = new Dog();
        dog3.name = "Jack";
    }

    public static class Dog {
        public String name;
    }
}
