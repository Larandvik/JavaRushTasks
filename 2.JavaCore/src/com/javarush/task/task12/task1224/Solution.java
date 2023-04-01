package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        String answer;
        if (o instanceof Cat) {
            answer = "Кот";
        } else if (o instanceof Tiger) {
            answer = "Тигр";
        } else if (o instanceof Lion) {
            answer = "Лев";
        } else if (o instanceof Bull) {
            answer = "Бык";
        } else {
            answer = "Животное";
        }

        return answer;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
