package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        int first = path.indexOf("jdk");
        int second = path.indexOf("/", first + 1);
        String oldPath = path.substring(first,second);
        String newPath = path.replace(oldPath, jdk);
        return newPath;
    }
}
