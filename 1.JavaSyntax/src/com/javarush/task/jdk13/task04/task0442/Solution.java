package com.javarush.task.jdk13.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        
        while (true) {
            int i = Integer.parseInt(reader.readLine());
            result = result + i;
            
            if (-1 == i) {
                break;
            }
            }
            System.out.println (result);
        }
        
    }

