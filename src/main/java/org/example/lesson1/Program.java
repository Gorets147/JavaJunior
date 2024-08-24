package org.example.lesson1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Привет", "мир", "!", "я", "родился");

        list.stream().filter(str -> str.length() > 4)
                .filter(str -> str.contains("о"))
                .forEach(System.out::println);

        Arrays.asList(1,6,2,12,3,6,1,6,12).stream()
                .sorted().distinct()
                .forEach(System.out::println);
    }

}
