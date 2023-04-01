package com.javarush.task.jdk13.task09.task0915;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* 
Перехват выборочных исключений
*/

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        try {
            handleExceptions();
        } catch (FileSystemException e) {
            BEAN.log(e);
        }
    }

    public static void handleExceptions()throws FileSystemException {
        try {
            BEAN.methodThrowExceptions();
        } catch (FileSystemException e) {
            BEAN.log(e);
            throw e;
        } catch (IOException e) {
            BEAN.log(e);
        }
    }

    public static class StatelessBean {

        public int i = (int) (Math.random() * 3);

        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            if (i == 0) {
                throw new CharConversionException();
            } else if (i == 1) {
                throw new FileSystemException("");
            } else if (i == 2) {
                throw new IOException();
            }
        }
    }
}
