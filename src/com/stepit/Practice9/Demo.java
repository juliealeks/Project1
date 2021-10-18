package com.stepit.Practice9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class Demo {
    public static void main(String[] args) {
//        int x= 0;
//        int y = 10;
//        int z = y/x;

//        FileReader file = new FileReader("C://test//a.txt");
//        BufferedReader fileInput = new BufferedReader(file);
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println();
//        }
        Dog dog = new Dog("Phil");
        dog.putCollar();
        dog.putLeash();
        dog.putMuzzle();
        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Check the ready \n" +

                    "Collar " + dog.isCollarPutOn +
                    "\nLeash " + dog.isLeashPutOn +
                    "\nMuzzle " + dog.isMuzzlePutOn);
      //      e.printStackTrace();
        }
    }

}
