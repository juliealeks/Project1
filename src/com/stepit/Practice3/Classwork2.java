package com.stepit.Practice3;

import java.util.Scanner;

public class Classwork2 {
    public static void main(String[] args) {
//        System.out.println("Enter your number ");
       Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number ");
        int num1= input.nextInt();

        System.out.println("Enter your second number ");
        int num2 = input.nextInt();

        int max = (num1 >= num2)?num1:num2;
        System.out.println(max);

//        int numberMain = input.nextInt();
//        if (isEven(numberMain)) {
//            System.out.println("The number is even ");
//        }
//        else
//            System.out.println("The number is odd ");
//
//    }
//    static boolean isEven(int number) {
//              return (number %2 == 0);
    }
}
