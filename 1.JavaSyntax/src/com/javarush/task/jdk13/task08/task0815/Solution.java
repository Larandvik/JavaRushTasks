package com.javarush.task.jdk13.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Одинаковые имя и фамилия
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Ларионов", "Андрей");
        map.put("Беляев", "Вася");
        map.put("Борисов", "Саня");
        map.put("Белькович", "Игорь");
        map.put("Вадеев", "Виталий");
        map.put("Валиев", "Саня");
        map.put("Жилкин", "Никита");
        map.put("Гарантищик", "Вася");
        map.put("Касуля", "Костик");
        map.put("Колтаков", "Костик");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()){
            if (name.equals(entry.getValue())) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (lastName.equals(entry.getKey())){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
