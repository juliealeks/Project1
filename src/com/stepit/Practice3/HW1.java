package com.stepit.Practice3;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        repeat();
    //    checkage();
    //    grade();
    //    avgScore();
    }

  static void repeat() {

    Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter your second number: ");
        int num2 = input.nextInt();

        if (num1 > num2)    System.out.printf("%d > %d%n", num1, num2);
        else if (num1 < num2)    System.out.printf("%d < %d%n", num1, num2);
        else
            System.out.printf("%d = %d%n", num1, num2);
        repeat();

//    static void checkage() {
//
//    Scanner input = new Scanner(System.in);

//        System.out.println("Enter your male, please: ");
//        String answer = input.nextLine();

//        System.out.println("Enter your age: ");

//    int a = input.nextInt();
//    int b = 70;// men max age
//    int c = 65;// women max age
//    int Yearsleft1; // men result
//    int Yearsleft2; // women result
//    int Yearspast1;
//    int Yearspast2;
//    Yearsleft1 = (b - a);
//    Yearsleft2 = (c - a);
//    Yearspast1 = (a - b);
//    Yearspast2 = (a - c);
//
//
//        if (answer.equals("men") && (a < b))
//            System.out.printf("Years left to pension = %d%n", Yearsleft1);
//        if (answer.equals("men") && (a > b))
//            System.out.printf("Years past pension = %d%n", Yearspast1);
//
//
//        if (answer.equals("women") && (a < c))
//            System.out.printf("Years left to pension = %d%n", Yearsleft2);
//        if (answer.equals("women") && (a > c))
//            System.out.printf("Years past pension = %d%n", Yearspast2);
//        else
//            System.out.println("Let's try again ) ");


//    static void grade() {
//
//        System.out.println("Enter your score, please: ");
//        Scanner input = new Scanner(System.in);
//
//        int score = input.nextInt();
//
//        if (score >= 90) System.out.println("A");
//        else if (score >= 80) System.out.println("B");
//        else if ( score >= 70) System.out.println("C");
//        else if (score >= 60) System.out.println("D");
//        else System.out.println("F");

//    static void avgScore() {
//
//        Scanner input = new Scanner(System.in);
//        int num = 5;
//        int score = 0;
//        int sum = 0;
//        int i = 1;
//
//        do {
//            i++;
//            System.out.print("Enter your number: ");
//            num = input.nextInt();
//
//            sum += score;
//
//            System.out.print("Enter your score: ");
//            score = input.nextInt();
//
//        }
//        while (i <= 5);
//
//        sum += score;
//        double avg = (sum / 5.0);
//        System.out.print("The groop average is: " + avg);

    }
}









