package com.javarush.task.jdk13.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    private int left;
    private int top;
    private int width;
    private int height;

    public void initialize (int left) {
        this.left = left;
    }
    public void initialize (int left, int top) {
        this.left = left;
        this.top = top;
    }
    public void initialize (int width, int height, int left, int top) {
        this.width = width;
        this.height = height;
        this.left = left;
        this.top = top;
    }
    public void initialize (Rectangle rectangle) {
        this.left = rectangle.left;
        this.top = rectangle.top;
    }


    public static void main(String[] args) {

    }
}
