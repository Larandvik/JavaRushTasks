package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        Scanner scanner = new Scanner(new FileInputStream(filePath));

        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            if (value % 2 == 0) {
                list.add(value);
            }
        }

        Collections.sort(list);

        for (Integer value : list) {
            System.out.println(value);
        }
        scanner.close();
    }
}
