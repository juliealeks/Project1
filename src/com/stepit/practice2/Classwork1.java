package com.stepit.Practice2;
import java.util.Random;
import java.util.Scanner;
public class Classwork1 {
    public static void main(String[] args) {
        // multiple ways to declare an array
        int[] arrayExample; // declare a variable of a type array of integers
        int[] arrayExample1 = new int[20]; // declare a variable of a type array of 20 integers
        int[] arrayExample2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // declare & populate array of integers
        int[] arrayExample3 = new int[5]; // declare 5-elements array as object
        int[] arrayExample4 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // declare array as object & populate
        // print array's elements one by one
        System.out.println("Element at index 0" + arrayExample2[0]);
        System.out.println("Element at index 0" + arrayExample2[1]);
        System.out.println("Element at index 0" + arrayExample2[2]);
        System.out.println("Element at index 0" + arrayExample2[3]);
        System.out.println("Element at index 0" + arrayExample2[4]);
        System.out.println("Element at index 0" + arrayExample2[5]);
        System.out.println("Element at index 0" + arrayExample2[6]);
        System.out.println("Element at index 0" + arrayExample2[7]);
        System.out.println("Element at index 0" + arrayExample2[8]);
        System.out.println("Element at index 0" + arrayExample2[9]);
        // print array's elements via the for loop
        for (int i = 0; i < arrayExample2.length; i++)
            System.out.println("Element at index " + i + " : " + arrayExample2[i]);
        // print via for each
        for (int p:arrayExample4)
            System.out.println("Element of arrayExample3 " + p);
        // assign value to an array element
        arrayExample1[0] = 15;
        // assign random value to an array element
        Random r = new Random();
        arrayExample1[1] = r.nextInt(1000);
        // assign random value in range to an array element
        int a = 5;
        int b = 55;
        arrayExample1[2] = (int)((Math.random() * (b - a + 1)) + a);
        // assign value to an array element from input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter fourth element of arrayExample1");
        arrayExample1[3] = in.nextInt();
        // call fullArray method accepting 1 argument of type array of ints
        fullArray(arrayExample1);
        System.out.println("Array after first population ");
        // call arrayDisplay method to check if our array got populated properly
        arrayDisplay(arrayExample1);
        // call fullArray method accepting 3 argument of type int
        fullArray(arrayExample3, 5, 10);
        System.out.println("Array after second population ");
        // call arrayDisplay method to check if our array got populated properly
        arrayDisplay(arrayExample3);
        // call createArray method accepting 3 argument of type int
        int[] arrayExample5 = createArray(10, 5, 10);
        System.out.println("Array after creation ");
        // call arrayDisplay method to check if our array got populated properly
        arrayDisplay(arrayExample5);
        // call arrayDisplay method for an array created via the createArray method without parameters
        arrayDisplay(createArray());
    }
    // method for printing array elements on one line separated by " "
    static void arrayDisplay(int[] array){
        System.out.println();
        for (int p:array)
            System.out.print(p + " ");
    }
    // method for printing array elements in a column with indexes
    static void arrayExplicitDisplay(int[] array){
        for (int i = 0; i < array.length; i++)
            System.out.println("Element at index " + i + " : " + array[i]);
    }
    // ERRONEOUS method for populating an array with for each, that cannot be used for assigning values!
    static int[] tryFullArray(int[] array) {
        Scanner in = new Scanner(System.in);
        for (int p : array) {
            System.out.println("Enter element ");
            p = in.nextInt();
            // THIS WON'T WORK BECAUSE p only holds a copy of the current element.
            // It's assignment won't be reflected on the iterated array!
        }
        arrayDisplay(array);
        return array;
    }
    // correct method for populating array elements with the input values
    static int[] fullArray(int[] array) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter element nr. " + i);
            array[i] = in.nextInt();
        }
        return array;
    }
    // overloading method for populating an array with random values
    static int[] fullArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++){
            array[i] = (int) ((Math.random() * (max - min+1)) + min);
        }
        return array;
    }
    // method for creating an array of a defined size with random values in range
    static int[] createArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int) ((Math.random() * (max - min+1)) + min);
        }
        return array;
    }
    // overriding method for creating an array
    static int[] createArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = in.nextInt();
        System.out.println("Enter minimum value of an element");
        int min = in.nextInt();
        System.out.println("Enter maximum value of an element");
        int max = in.nextInt();
       // return createArray(size, min, max);
        int[] array = new  int [size];
        return fullArray(array, min, max);
    }
}


