package com.stepit.practice5;

import java.util.*;
public class HW7 {

    public static void main(String[] args) {

        System.out.println("Find the minimal element. ");

        int[] a = {189, 45, 78, 1005, -100, -99, -79, 0, -55};
        int min = a[0];

        for (int x : a) {
            if (x < min) min = x;
        }
        System.out.println("The minimal element is: " + min);



        System.out.println("Find the longest word in a sentence. ");

        String s = "Find the longest word in a sentence ";
        String[] word = s.split(" ");

        String maxlengthWord = "";
        for (String value : word) {
            if (value.length() >= maxlengthWord.length()) {
                maxlengthWord = value;
            }
        }
        System.out.println(maxlengthWord + " - is the longest word. ");



        Integer[] newArray = {189, 45, 78, 1005, -100, -99, -79, 0, -55};

        Arrays.sort(newArray);

        for (int num : newArray) {
            System.out.println(num);
        }

        System.out.println("Descending sorting: ");

        Arrays.sort(newArray, Collections.reverseOrder());

        for (int num : newArray) {
            System.out.println(num);
        }

        }
    }





