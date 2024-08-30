package org.example.homework2;

import java.lang.reflect.Method;

public class Program {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> str = Class.forName("java.lang.String");

        Method[] methods = str.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println("Метод: " + methods[i]);
        }
    }
}
