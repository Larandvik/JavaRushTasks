package com.javarush.task.jdk13.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код


    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = 1;
    }

    public Circle() {
        this.x = 1;
        this.y = 1;
        this.radius = 10;
    }
    public Circle(Circle circle) {
        this.x = circle.x;
        this.y = circle.y;
        this.radius = circle.radius;
    }

    public static void main(String[] args) {

    }
}