package com.stepit.practice2;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        int En = 1;
        int Fr = 2;
        int It = 3;
        int Sp = 4;
        int Ru = 5;
        int Un = 6;

        int enter;
        do {
            System.out.println("Please choose your language: English -1,French -2, Italian -3, Spanish -4, Russian -5.");
            enter = input.nextInt();
            if (enter == 1 )
                System.out.println("Hello! ". toUpperCase());
            else if (enter == 2 )
                System.out.println("Bon jour! ". toUpperCase());
            else if (enter == 3 )
                System.out.println("Buon giorno! ". toUpperCase());
            else if (enter == 4 )
                System.out.println("Hola! ". toUpperCase());
            else if (enter == 5)
                System.out.println("Привет! ". toUpperCase());
        }
        while (enter <= 5);
        System.out.println("Unknowing language. ");

    }
}


