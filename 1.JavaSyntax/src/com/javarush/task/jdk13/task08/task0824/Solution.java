package com.javarush.task.jdk13.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Вся семья в сборе
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("Андрей", true, 32);
        Human child2 = new Human("Никита", true, 37);
        Human child3 = new Human("Никто", false, 0);
        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human mother = new Human("Вера", false, 58, children);
        Human father = new Human("Витя", true, 60, children);
        ArrayList<Human> parentsMother = new ArrayList<>();
        parentsMother.add(mother);
        ArrayList<Human> parentsFather = new ArrayList<>();
        parentsFather.add(father);

        Human grandMother1 = new Human("Аля", false, 90, parentsFather);
        Human grandFather1 = new Human("Валентин", true, 90, parentsFather);
        Human grandMother2 = new Human("Нина", false, 90, parentsMother);
        Human grandFather2 = new Human("Александр", true, 90, parentsMother);

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother2.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
