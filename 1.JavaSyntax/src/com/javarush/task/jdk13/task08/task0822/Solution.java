package com.javarush.task.jdk13.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> list) {
        // Найти минимум тут
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(min > list.get(i)){
                min = list.get(i);
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < firstNumber; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        return numbers;
    }
}
