package com.javarush.task.jdk13.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);
        set.add(20);

        return set;


    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();) {
            int value = iterator.next();
            if (value > 10) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
    }
}
