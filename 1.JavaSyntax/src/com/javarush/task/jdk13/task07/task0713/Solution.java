package com.javarush.task.jdk13.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Три массива
*/

public class Solution {

    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0; i < 20; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < numbers.size(); i++) {
            Integer x = numbers.get(i);
            if (x % 3 == 0) {
                divBy3.add(x);
            }
            if (x % 2 == 0) {
                divBy2.add(x);
            }
            if (x % 3 != 0 && x % 2 != 0) {
                others.add(x);
            }
        }

        printList(divBy3);
        printList(divBy2);
        printList(others);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
