package com.javarush.task.jdk13.task05.task0509;

/* 
Заполнить класс Friend
*/

public class Friend {
    //напишите тут ваш код
    private String name;
    private int age;
    private char sex;

    public void initialize (String name) {
        this.name = name;
    }
    public void initialize (String name, int age) {
        this.age = age;
        this.name = name;
    }
    public void initialize (String name, int age, char sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }


    public static void main(String[] args) {

    }
}
