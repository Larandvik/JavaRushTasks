package com.javarush.task.jdk13.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {

    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> cats = new HashMap<>(10);
        cats.put("Barsik1", new Cat("Barsik1"));
        cats.put("Barsik2", new Cat("Barsik2"));
        cats.put("Barsik3", new Cat("Barsik3"));
        cats.put("Barsik4", new Cat("Barsik4"));
        cats.put("Barsik5", new Cat("Barsik5"));
        cats.put("Barsik6", new Cat("Barsik6"));
        cats.put("Barsik7", new Cat("Barsik7"));
        cats.put("Barsik8", new Cat("Barsik8"));
        cats.put("Barsik9", new Cat("Barsik9"));
        cats.put("Barsik10", new Cat("Barsik10"));
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet<Cat> setCats = new HashSet<>();
        for (Cat cat : map.values()) {
            setCats.add(cat);
        }
        return setCats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        public String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Cat)) {
                return false;
            }
            Cat cat = (Cat) o;
            return Objects.equals(name, cat.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
