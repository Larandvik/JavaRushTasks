package com.javarush.task.jdk13.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Удалить всех людей, родившихся летом
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Ларионов", dateFormat.parse("DECEMBER 14 1990"));
        map.put("Жилкин", dateFormat.parse("JULY 14 1990"));
        map.put("Ласков", dateFormat.parse("DECEMBER 14 1990"));
        map.put("Демьяненков", dateFormat.parse("DECEMBER 14 1990"));
        map.put("Есипов", dateFormat.parse("JUNE 14 1990"));
        map.put("Романов", dateFormat.parse("DECEMBER 14 1990"));
        map.put("Путин", dateFormat.parse("AUGUST 14 1990"));
        map.put("Лавров", dateFormat.parse("JANUARY 14 1990"));
        map.put("Медведев", dateFormat.parse("DECEMBER 14 1990"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Map<String, Date> copy = new HashMap<>(map);
        for (String key : copy.keySet()) {
            Date date = copy.get(key);
            int month = date.getMonth() + 1;
            if (month == 6 || month == 7 || month == 8) {
                map.remove(key);
            }
        }

    }

    public static void main(String[] args) throws ParseException {

        removeAllSummerPeople(createMap());
    }
}
