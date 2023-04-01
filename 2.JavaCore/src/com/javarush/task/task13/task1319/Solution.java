package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        String userText = null;

        do {
            userText = reader.readLine();
            writer.write(userText);
            writer.newLine();
        } while (!(userText.equalsIgnoreCase("exit")));
        reader.close();
        writer.close();
    }
}
