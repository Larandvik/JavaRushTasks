package com.javarush.task.jdk13.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные буквы
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder stringBuilder = new StringBuilder(reader.readLine().replace(" ", ""));

        StringBuilder vowel = new StringBuilder();
        StringBuilder consonants = new StringBuilder();



        for (int i = 0; i < stringBuilder.length(); i++) {
            if (isVowel(stringBuilder.charAt(i))) {
                vowel.append(stringBuilder.charAt(i));
                vowel.append(" ");
            }
            if (!isVowel(stringBuilder.charAt(i))) {
                consonants.append(stringBuilder.charAt(i));
                consonants.append(" ");

            }
        }
        System.out.println(vowel);
        System.out.println(consonants);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}