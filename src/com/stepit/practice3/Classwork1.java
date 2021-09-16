package com.stepit.practice3;

import java.util.Random;
import java.util.Scanner;

public class Classwork1 {
  //  public static void main(String[] args) {
        //   String[] cars = {"Volvo", "BMW","Ford", "Mazda"};
        //  for ()

        //      int[][] myNumbers


        //  static void myMethod() {
        //       System.out.println("I just got executed!");

        //  }
        //   public static void main(String[] args) {
        //      myMethod();
        //    myMethod();
        //     myMethod();

        //   static void myMethod(String fname, int age) {
        //      System.out.println(fname + "is" + age);
        //     public static void main(String[] args) {
        //         myMethod("Liam");
        //         myMethod("Jenny" );
        //        myMethod("Anja");\
        // static int myMethod(int x) {
        //    return 5 + x;


        // public static void main(String[] args) {
        //     System.out.println(myMethod(3));


        //  static int myMethod(int x, int y) {
        //    return x + y;
        // static void checkAge( int age) {
        //    if (age < 18) {
        //     System.out.println("Access denied - You are not ");

        //  static int plusMethodInt(int x, int y) {
        //    return x + y;
        //  }

        //  static double plusMethodDouble(double x, double y) {
        //      return x + y;

        //  public class main {
        //  public static void main(String[] args) {
        //   int myNum1 = plusMethodInt(8, 5);
        //    double myNum2 = plusMethodDouble(4.3, 6.26);
        //    System.out.println("int: " + myNum1);
        //   System.out.println("double: " + myNum2);

        //    int result = sum(10);
        //    System.out.println(result);

        //    public static int sum(int k){
        //       if (k > 0) {
        //           return k + sum(k - 1);
        //     } else {
        //          return 0;

        //    public class Main {
        //       public static void main(String[] args){
     //   int result = sum(5, 10);
     //   System.out.println(result);
 //   }

 //   public static int sum(int start, int end) {
  //      if (end > start) {
  //          return end + sum(start, end - 1);
  //      } else {
  //          return end;
     //   public class Arrays {
            public static void main(String[] args) {
                int[] intArray;
                int[] intArray1 = new int[20];
                int[] intArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                int[] intArray3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                //   for ( int i = 0; i < intArray2.length; i++)
                //       System.out.println("Element at index " + i +
                //               " : " + intArray2[i]);
//                for ( int p:intArray3) {
                //         System.out.println(p);
                showArray(intArray3);
                intArray1[0] = 15;
                Random r = new Random();
                intArray1[1] = r.nextInt(1000);
                int a = 5;
                int b = 55;
                intArray1[2] = (int) (Math.random() * (b - a) + a);

                Scanner in = new Scanner(System.in);
                System.out.println("Enter forth element ");
                intArray1[3] = in.nextInt();
            }
    static void showArray(int[] array){
                    for ( int p:array)
                        System.out.println(p);
                }
                static void fullArray(int[] array, int min, int max) {
                    Scanner in = new Scanner(System.in);
                for ( int p:array){

                    System.out.println("Enter forth element ");
                    p = in.nextInt();
                }
        }
}















