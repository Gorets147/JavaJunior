package org.example.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,10,100,100};



        System.out.println(arithmeticMeanOfEven(numbers));
    }

    public static long arithmeticMeanOfEven(int[] numbers){

        long count = Arrays.stream(numbers)
                .filter(num -> num % 2 == 0).count();

        long res = Arrays.stream(numbers)
                .filter(num -> num % 2 == 0).sum() / count;

        return res;
    }

}
