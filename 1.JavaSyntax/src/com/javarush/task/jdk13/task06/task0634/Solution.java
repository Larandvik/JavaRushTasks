package com.javarush.task.jdk13.task06.task0634;

import java.util.Scanner;

/* 
Шахматная доска
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        array = new char[sizeArray][sizeArray];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j + i) % 2 == 0) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
