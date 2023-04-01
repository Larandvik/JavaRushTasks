package com.javarush.task.jdk13.task08.task0831;

import java.util.Arrays;

/* 
Любимые настолки
*/

public class Solution {

    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {
        BoardGame chess = new BoardGame();
        chess.name = "Шахматы";
        collection[0] = chess;

        //напишите тут ваш код
        BoardGame fool = new BoardGame();
        fool.name = "Дурак";
        collection[1] = fool;

        BoardGame checkers = new BoardGame();
        checkers.name = "Шашки";
        collection[2] = checkers;

        BoardGame nard = new BoardGame();
        nard.name = "Нарды";
        collection[3] = nard;

        BoardGame solitaire = new BoardGame();
        solitaire.name = "Пасьянс";
        collection[4] = solitaire;

        System.out.println(Arrays.toString(collection));
    }
}