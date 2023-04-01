package com.javarush.task.pro.task06.task0616;

/* 
Учет работников
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(salary);
        System.out.println(position);
    }
    public static String name = "Amigo";
    public static String position = "Java developer";
    public static int salary = 10_000;

    public void setPosition(String position) {
        this.position = Solution.position;
    }

    public void setSalary(int salary) {
        this.salary = Solution.salary;
    }
}
