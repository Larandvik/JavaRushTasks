package com.javarush.task.jdk13.task02.task0204;

/* 
Man и woman
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man = new Man();
        Woman woman = new Woman();
        man.wife = woman;
        woman.husband = man;
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}
