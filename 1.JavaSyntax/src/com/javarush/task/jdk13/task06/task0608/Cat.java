package com.javarush.task.jdk13.task06.task0608;

/* 
Статические методы: int getCatCount() и setCatCount(int)
*/

public class Cat {
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        //напишите тут ваш код
        return catCount;

    }

    public static void setCatCount(int catCount) {
        //напишите тут ваш код
        Cat.catCount = catCount;

    }

    public static void main(String[] args) {

    }
}
