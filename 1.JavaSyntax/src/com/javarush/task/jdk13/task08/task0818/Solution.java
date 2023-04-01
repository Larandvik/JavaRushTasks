package com.javarush.task.jdk13.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Налоговая и зарплаты
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> salary = new HashMap<>();
        salary.put("Путин", 1000);
        salary.put("Медведев", 1000);
        salary.put("Мишустин", 1000);
        salary.put("Клишас", 1000);
        salary.put("Собянин", 1000);
        salary.put("Простолюдин1", 40);
        salary.put("Простолюдин2", 40);
        salary.put("Простолюдин3", 40);
        salary.put("Простолюдин4", 40);
        salary.put("Простолюдин5", 40);

        return salary;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> entry : copy.entrySet()) {
            Integer salary = entry.getValue();
            if (salary < 500) {
                map.remove(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {

        removeItemFromMap(createMap());

    }
}