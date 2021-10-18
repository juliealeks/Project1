package com.stepit.Practice1;

import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        String hi = "Hello ";
        String name;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name:");
        name = input.nextLine();

        System.out.println(hi + name);
        System.out.println("You are in : " + 2021 + " year");
        System.out.println("The result is: " + (2+3));
    }
}
