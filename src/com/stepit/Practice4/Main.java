package com.stepit.Practice4;

public class Main {
    static void myStaticMethod() {
        System.out.println("lkkjh");
    }
    public void myPublicMethod() {
        System.out.println("45678");
    }
    public static void main(String[] args ) {
        myStaticMethod();
     //   myPublicMethod();

     Main myObj = new Main();
     myObj.myPublicMethod();
    }
}
