package com.javarush.task.jdk13.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Woman woman1 = new Woman("Alice", 20, "Moscow");
        Woman woman2 = new Woman("Mary", 21, "NY");
        System.out.println(woman1);
        System.out.println(woman2);

        Man man1 = new Man("Andrei", 32, "Argentina");
        Man man2 = new Man("Nikita", 38, "Moscow");
        System.out.println(man1);
        System.out.println(man2);
    }

    //напишите тут ваш код
    public static class Man {

        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {

        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
