package com.javarush.task.jdk13.task09.task0934;

/* 
Палиндром слова
*/

public class Solution {
    public static void main(String[] args) {
        String word = "Ротор";
        String answer = isPalindrome(word) ? "Да" : "Нет";
        System.out.println("Слово \"" + word + "\" палиндром? " + answer);
    }

    public static boolean isPalindrome(String word) {
        //напишите тут ваш код
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        String palindrome = builder.toString();
        return (palindrome.equalsIgnoreCase(word));
    }
}
