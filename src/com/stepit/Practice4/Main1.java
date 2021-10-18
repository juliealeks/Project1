package com.stepit.Practice4;

public class Main1 {
    public void fullThrottle()  {
        System.out.println("The car is going as fast as it can! ");
    }
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed );
    }
    public static void main(String[] args ) {
        Main1 myCar = new Main1();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
