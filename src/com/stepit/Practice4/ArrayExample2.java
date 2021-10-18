package com.stepit.Practice4;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Order the size of your array ");
        int size = scanner.nextInt();

        int [] array = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {

        array [i] = random.nextInt(1000);
        }

        for (int a:array
             ) {
            System.out.println(a);

        }
    }
}
