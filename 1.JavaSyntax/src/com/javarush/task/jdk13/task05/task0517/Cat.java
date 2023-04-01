package com.javarush.task.jdk13.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public Cat(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 1;
        this.color = "Black";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Black";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.color = "Black";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.age = 1;
        this.address = null;
    }

    public Cat(int weight,String color, String address) {
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.name = null;
        this.age = 1;
    }

    public static void main(String[] args) {

    }
}
