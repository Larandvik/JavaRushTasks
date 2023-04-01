package com.javarush.task.jdk13.task09.task0920;

/* 
Обратный отсчет от 5 до 0
*/

public class Solution {
    public static void main(String[] args)  {
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);

            //напишите тут ваш код
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println();;
            }
        }
    }
}
