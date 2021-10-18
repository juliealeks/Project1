package com.stepit.Practice4;

//public class BubbleSort {
//    public static void main(String[] args) {
//        int[] newArray = {12, 13, 14, 15, -1, 0};
//        boolean desc = true;
//        sort(newArray, desc);
//        for (int a : newArray
//        ) {
//            System.out.println(a);
//
//        }
//        System.out.println("Sorting ascending ");
//        desc = false;
//        sort(newArray, desc);
//        for (int a : newArray
//        ) {
//            System.out.println(a);
//
//        }
//
//        static int temp;
//        static boolean swapped;
//
//        static void swap ( int[] x, int i){
//            temp = x[i];
//            x[i] = x[i + 1];
//            x[i + 1] = temp;
//            swapped = true;
//        }
//        static int[] sort ( int[] x ){
//            for (int j = 0; j < x.length; j++) {
//                swapped = false;
//                for (int i = 0; i < x.length - 1; i++) {
//                    if (x[i] < x[i + 1]) {
//                        swap(x, i);
//                    }
//                }
//                if (swapped = false)
//                    break;
//            }
//            return x;
//        }
//
//        static int[] sortAsc ( int[] x ){
//            for (int j = 0; j < x.length; j++) {
//                swapped = false;
//                for (int i = 0; i < x.length - 1; i++) {
//                    if (x[i] > x[i + 1]) {
//                        swap(x, i);
//                    }
//                }
//                if (swapped = false)
//                    break;
//            }
//            return x;
//        }
//        static int[] sort ( int[] x, boolean desc ){
//            for (int j = 0; j < x.length; j++) {
//                swapped = false;
//                for (int i = 0; i < x.length - 1; i++) {
//                    if (desc) {
//                        if (x[i] < x[i + 1]) {
//                            swap(x, i);
//                        }
//                    } else {
//                        if (x[i] > x[i + 1]) {
//                            swap(x, i);
//                        }
//                    }
//                }
//                if (swapped = false)
//                    break;
//            }
//            return x;
//        }
//
//    }
//}