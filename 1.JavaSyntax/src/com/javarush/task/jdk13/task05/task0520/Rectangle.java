







package com.javarush.task.jdk13.task05.task0520;

/* 
Заполнить класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    private int left;
    private int top;
    private int width;
    private int height;

    public Rectangle (int left) {
        this.left = left;
    }
    public Rectangle (int left, int top) {
        this.left = left;
        this.top = top;
    }
    public Rectangle (int left, int top, int width, int height) {
        this.left = left;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Rectangle (Rectangle rectangle) {
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public static void main(String[] args) {

    }
}
