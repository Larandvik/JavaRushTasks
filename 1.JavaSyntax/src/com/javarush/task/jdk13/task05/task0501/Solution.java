package com.javarush.task.jdk13.task05.task0501;

/* 
Кошачья бойня(1)
*/

public class Solution {

    public static class Cat {
        //напишите тут ваш код

        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }



        public boolean fight(Cat anotherCat){

            int round1 = Integer.compare(this.age, anotherCat.age);
            int round2 = Integer.compare(this.weight, anotherCat.weight);
            int round3 = Integer.compare(this.strength, anotherCat.strength);
            int result = round1 + round2 + round3;
            return result > 0;
            }

    }

    public static void main(String[] args) {
        Cat c1 = new Cat("Barsik", 5, 7, 5);
        Cat c2 = new Cat("White", 7, 8, 10);
        Cat c3 = new Cat("Black", 9, 10, 50);

        System.out.println(c2.fight(c1) == true ? "победил с2" : "победил с1");
        System.out.println(c2.fight(c3) == true ? "победил с2" : "победил с3");
        System.out.println(c1.fight(c3) == true ? "победил с1" : "победил с3");
    }
}
