package com.javarush.task.pro.task05.task0511;

import java.util.Arrays;
import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        multiArray = new int[sizeArray][];

        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[scanner.nextInt()];
            System.out.println();
            System.out.println(Arrays.deepToString(multiArray));
        }
    }
}
