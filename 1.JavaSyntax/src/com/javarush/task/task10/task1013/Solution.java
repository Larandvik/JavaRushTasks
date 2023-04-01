package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private int weight;
        private String country;
        private String job;
        private String hobby;

        public Human(String name) {
            this.name = name;
        }
        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, int age, int weight, String country) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.country = country;
        }

        public Human(String name, int age, int weight, String country, String job) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.country = country;
            this.job = job;
        }

        public Human(String name, int age, int weight, String country, String job, String hobby) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.country = country;
            this.job = job;
            this.hobby = hobby;
        }
        public Human(Human human) {
            this.name = human.name;
            this.age = human.age;
            this.weight = human.weight;
            this.country = human.country;
            this.job = human.job;
            this.hobby = human.hobby;
        }

        public Human(int age, String hobby) {
            this.age = age;
            this.hobby = hobby;
        }

        public Human(String name, String job, String hobby) {
            this.name = name;
            this.job = job;
            this.hobby = hobby;
        }

        public Human(int age, int weight) {
            this.age = age;
            this.weight = weight;
        }
    }

}
