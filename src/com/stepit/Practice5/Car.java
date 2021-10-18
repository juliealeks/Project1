package com.stepit.Practice5;

public class Car {
    int x = 5;
    final int y = 5;
    int numberOfDoors;
    String color;
    boolean isnew;
//    static void sayHello() {
//        System.out.println("Hello");
//    }
//
//    public void sayBye() {
//        System.out.println("Bye");
//    }
   public Car(int num) {
            numberOfDoors = num;
         }
    public Car(String desiredColor) {
       color = desiredColor;
    }
 //   public Car()
    public void fullThrottle()  {
        System.out.println("The car is going as fast as it can! ");
    }
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed );
    }

    public static void main(String[] args) {
//        Main myObj = new Main();
//        System.out.println(myObj.x);
//        System.out.println(myObj.y);
//        myObj.x = 100;
//      //  myObj.y = 6;
//        System.out.println(myObj.x);
//        System.out.println(myObj.y);

//        myObj.sayBye();
//        Car myCar = new Car();
//        myCar.fullThrottle();
//        myCar.speed(200);
    }
}
