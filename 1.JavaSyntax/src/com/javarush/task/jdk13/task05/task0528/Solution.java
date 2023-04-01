package com.javarush.task.jdk13.task05.task0528;


/* 
Вывести на экран сегодняшнюю дату
*/



import java.text.SimpleDateFormat;
import java.util.Date;


public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(simpleDateFormat.format(new Date()));


    }
}
