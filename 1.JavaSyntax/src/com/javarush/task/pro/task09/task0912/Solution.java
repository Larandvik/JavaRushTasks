package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        //напишите тут ваш код
        String urlProtocol;
        if (url.startsWith("http:")) {
            urlProtocol = "http";
        } else if (url.startsWith("https:")) {
            urlProtocol = "https";
        } else {
            urlProtocol = "неизвестный";
        }
        return urlProtocol;
    }

    public static String checkDomain(String url) {
        //напишите тут ваш код
        String urlDomain;
        if (url.endsWith("com")) {
            urlDomain = "com";
        } else if (url.endsWith("net")) {
            urlDomain = "net";
        } else if (url.endsWith("org")) {
            urlDomain = "org";
        } else if (url.endsWith("ru")) {
            urlDomain = "ru";
        } else {
            urlDomain = "неизвестный";
        }
        return urlDomain;
    }
}
