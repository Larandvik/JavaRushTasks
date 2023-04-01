package com.javarush.task.jdk13.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String,String> map = new HashMap<>();
        map.put("Ларионов", "Андрей");
        map.put("Ларионов", "Никита");
        map.put("Ларионов", "Виктор");
        map.put("Ларионов", "Андрей");
        map.put("Ларионова","Вера");
        map.put("Жилкина", "Женя");
        map.put("Жилкина", "Наташа");
        map.put("Жилкин", "Александр");
        map.put("Жилкин", "Андрей");
        map.put("Жилкин", "Андрей");


        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
