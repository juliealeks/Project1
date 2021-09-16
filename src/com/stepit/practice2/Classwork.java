package com.stepit.practice2;

public class Classwork {
    public static void main(String[] args) {
        double myDouble = 9.78d;
        int myInt = (int) myDouble;
        System.out.println(myDouble);
        System.out.println(myInt);

//        int x = 1000;
//        x+=3;
//        System.out.println("x after x+=3: " + x);
//        x-=3;
//        System.out.println("x after x-=3: " + x);
//        x/=3;
//        System.out.println("x after x/=3: " + x);
//        x*=3;
//        System.out.println("x after x*=3: " + x);
//        x%=3;
//        System.out.println("x after x%=: " + x);x++;
//        System.out.println("x after x++: " + x);
//        x--;
//        System.out.println("x after x--: " + x);

//        int x = 5, y = 5;
        //       System.out.println(++x);
//        System.out.println(x);
//        System.out.println(y++);
//        System.out.println(y);

        String txt = "Hello To Everybody";
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
//        System.out.println(txt.indexOf("Everybody"));

//        String firstName = "John";
//        String lastName = "Doe";
//        System.out.println(firstName+ " " + lastName);

//        String firstName = "John ";
//        String lastName= "Doe";
//        System.out.println(firstName.concat(lastName));

//        int time = 22;
//        if (time < 10) {
//            System.out.println("Good morning. ");
//        } else  if (time > 20) {
//            System.out.println("Good day. ");
//        }    else {
        //           System.out.println("Good evening. ");
        //       }
//        int time = 20;
//        String result = (time > 18) ? "Good day." : "Good evening.";
//        System.out.println(result);
//        System.out.println(Math.max(x,y));
//        System.out.println(Math.min(x,y));
//        System.out.println(Math.sqrt(x));
//        System.out.println(Math.abs(x));
//        System.out.println(Math.random() * (b-a)) + a;
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");

                //   int i = 0;
                //    do {
                //       System.out.println(i);
                //       i++;
        }
        //   while (i < 5);
        //{
        //   System.out.println(i);
        //   i++;
        for (int i = 0; i < 50; i += 10) {
            System.out.println(i);
        }
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
       // for (int i = 0; i < 10; i++) {
            // if (i==4) {
            //  break;
            //  }
         //   System.out.println(i);
            for (int i = 0; i < 10; i++) {
                if (i == 4) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }







