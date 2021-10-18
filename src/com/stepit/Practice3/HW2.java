package com.stepit.Practice3;
import java.util.Scanner;
public class HW2 {
    public static void main(String[] args) {
       // repeat();

        //       Scanner input = new Scanner(System.in);
//            System.out.println ("Пожалуйста, введите имя студента:");
//            String name = input.next();
        //         int sum = 0,score;
//            for(int i = 0; i < 5; i++) {
//                System.out.println ("Пожалуйста, введите оценку курса" + (i + 1) + ":");
//                score = input.nextInt (); // Получение входной оценки
//                sum += score; // набираем баллы, чтобы найти общий балл
//            }
//            double avg = sum / 5.0; // Рассчитываем средний балл
//            System.out.printf ("Средняя оценка студента% s экзамена:% .2f", name, avg);
//        int StNumber = 5;
//        int score = 0;
//                int score2;
//                int score3;
//                int score4;
//                int score5;

//        int sum = 0;
//        int i = 1;
//int count = 0;
//        do {
//            i++;
//            System.out.print("Enter your number: ");
//            StNumber = input.nextInt();
//            //    if (StudentNumber >= 5)
//            sum += score;
//          //  double avg = (sum / 5.0); // Рассчитываем средний балл
//            System.out.print("Enter your score: ");
//            score = input.nextInt();
        //    System.out.print ( avg);

//                    score2= input.nextInt();
//                    score3= input.nextInt();
//                    score4= input.nextInt();
//                    score5= input.nextInt();
        //  }
        //   while (i <= 5);


//    sum += score;
//       double avg = (sum / 5.0); // Рассчитываем средний балл
//           System.out.print ("The groop average is: " + avg);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your male, please: ");
        String answer = input.nextLine();
        System.out.println("Enter your age: ");
        int a = input.nextInt();
        int b = 70;// men max age
        int c = 65;// women max age
        int Yearsleft1; // men result
        int Yearsleft2; // women result
        int Yearspast1;
        int Yearspast2;
        Yearsleft1 = (b - a);
        Yearsleft2 = (c - a);
        Yearspast1 = (a - b);
        Yearspast2 = (a - c);


        if (answer.equals("men") && (a < b))
            System.out.printf("Years left to pension = %d%n", Yearsleft1);
        if (answer.equals("men") && (a > b))
            System.out.printf("Years past pension = %d%n", Yearspast1);


        if (answer.equals("women") && (a < c))
            System.out.printf("Years left to pension = %d%n", Yearsleft2);
        if (answer.equals("women") && (a > c))
            System.out.printf("Years past pension = %d%n", Yearspast2);
        else {
            System.out.println("Let's try again ) ");
        }


//        static void repeat (); {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter your male, please: ");
//            String answer = input.nextLine();
//            System.out.println("Enter your age: ");
//            //    int a;// user age
//            int a = input.nextInt();
//
//            //   a = input.nextInt();
//            int b = 70;// men max age
//            int c = 65;// women max age
//            int Yearsleft1; // men result
//            int Yearsleft2; // women result
//            int Yearspast1;
//            int Yearspast2;
//            Yearsleft1 = (b - a);
//            Yearsleft2 = (c - a);
//            Yearspast1 = (a - b);
//            Yearspast2 = (a - c);
//
//
//            if (answer.equals("men") && (a < b))
//                System.out.printf("Years left to pension = %d%n", Yearsleft1);
//            if (answer.equals("men") && (a > b))
//                System.out.printf("Years past pension = %d%n", Yearspast1);
//            if (answer.equals("women") && (a < c))
//                System.out.printf("Years left to pension = %d%n", Yearsleft2);
//            if (answer.equals("women") && (a > c)) {
//                System.out.println("Enter your age: ");
//                System.out.printf("Years past pension = %d%n", Yearspast2);
//            } else {
//                System.out.println("Let's try again ) ");
//            }
        }
    }





