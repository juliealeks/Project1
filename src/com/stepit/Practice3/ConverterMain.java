package com.stepit.Practice3;

import java.util.Scanner;

public class ConverterMain {
    public static void main(String[] args) {
   //     System.out.println("Enter arabic number in one of following ");
   //     Scanner input = new Scanner(System.in);
   //     int arabic = input.nextInt();
    //    int arabic = enterInt();
     //  convertArabicToR(enterInt());
  // repeat(5);
    repeat();
  //  }
          //  int arabic = input.nextInt();
//        switch (arabic) {
//            case 1 -> System.out.println("I");
//            case 5 -> System.out.println("V");
//            case 10 -> System.out.println("X");
//            case 50 -> System.out.println("L");
//            case 100 -> System.out.println("C");
//            case 1000 -> System.out.println("M");
//            default -> System.out.println("Unexpected input ");
        }

    static void convertArabicToR(int num) {
        switch (num) {
            case 1 -> System.out.println("I");
            case 5 -> System.out.println("V");
            case 10 -> System.out.println("X");
            case 50 -> System.out.println("L");
            case 100 -> System.out.println("C");
            case 1000 -> System.out.println("M");
            default -> System.out.println("Unexpected input ");
        }
    }
   static int enterInt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter arabic num one of following ");
        int arabic = input.nextInt();
        return arabic;
    }
    static void repeat(int times) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter arabic num one of following ");
//        int arabic = input.nextInt();
//        convertArabicToR(arabic);
//        System.out.println("Do you want to continue? ");
//        String answer = input.nextLine();
//        if (answer.equals("yes")) {
//           // repeat();
//        }
        for (int i = times; i > 0; i--) {
           System.out.println(i + " Transactions left ");
            convertArabicToR(enterInt());
       }
    }
    static void repeat() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter arabic num one of following ");
        int arabic = input1.nextInt();
        convertArabicToR(arabic);
        System.out.println("Do you want to continue? ");
        Scanner input2 = new Scanner(System.in);
        String answer = input2.nextLine();
               if (answer.equals("yes")) {
repeat();
        }
        else if (answer.equals("no")) {
             return;  }
        else
            System.out.println("Incorrect input, please enter yes or no ");

//         for (int i = 0; i < times; i++) {
//            System.out.println(i + 1 + " Transaction ");
//            convertArabicToR(enterInt());


    }
}
