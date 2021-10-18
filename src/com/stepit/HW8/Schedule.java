package com.stepit.HW8;

import java.util.Scanner;

public class Schedule {

    public void nameOfTraining() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of training: Aqua, Fitness, Stretch, Yoga. ");
        String answer = input.nextLine();

        if (answer.equals("Aqua"))
            System.out.println("Aqua - Mon/Wed/Fri - 09.00/ 12.00/ 19.00 ");
        if (answer.equals("Fitness"))
            System.out.println("Fitness - Tue/Thu/Sat - 09.00/ 19.00/ 20.00 ");
        if (answer.equals("Stretch"))
            System.out.println("Stretch - Mon/Wed/Fri - 10.00/ 13.00/ 16.00");
        if (answer.equals("Yoga"))
            System.out.println("Yoga - Mon/Wed/Fri - 20.00; Tue/Thu - 08.00; Sun -13.00");
    }

}

