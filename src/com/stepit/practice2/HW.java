package com.stepit.practice2;

import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner; // program uses class Scanner

public class HW {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
                int number1; // first number to add
                int number2; // second number to add
                int number3; // third number to add
                int sum; // sum of number1, number2, number3
                int c;

                System.out.print("Enter first integer: "); // promt
                number1 = input.nextInt(); // read first number from user

                System.out.print("Enter second integer: "); // promt
                number2= input.nextInt(); // read second number from user

                System.out.print("Enter third integer: "); // promt
                number3 = input.nextInt();

                sum = number1 + number2 + number3; // add numbers, then store total in sum
                System.out.printf("Sum is %d%n", sum);

                c = (number1-number3)*(number2+number1)/10;
                System.out.printf("c = %d%n", c);


                if (number1 == number2)
                        System.out.printf("%d == %d%n", number1, number2);
                if (number2 != number3)
                        System.out.printf("%d != %d%n", number2, number3);
                if (number1 < number2)
                        System.out.printf("%d < %d%n", number1, number2);
                if (number3 <= number2)
                        System.out.printf("%d <= %d%n", number3, number2);
                if (number1 >= number2)
                        System.out.printf("%d >= %d%n", number1, number2);

                int UnknownNumber, UserNumber, TrysCount = 0;
                System.out.println("Target: Guess a number (from 0 to 100).");
                UnknownNumber = (int)Math.floor(Math.random() * 100);
                do {
                        TrysCount++;
                        System.out.print("Enter your number: ");
                        UserNumber = input.nextInt();
                        if (UserNumber > UnknownNumber)
                                System.out.println("My number is less.");
                        else if (UserNumber < UnknownNumber)
                                System.out.println("My number is greater.");
                        else
                                System.out.println("You guessed!");
                }
                while (UserNumber != UnknownNumber);
                System.out.println("Number of attempts: " + TrysCount);
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

           //  end method main
   // end class HW
                

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

           //  end method main
   // end class HW

