package com.stepit.Practice9;

import java.util.Arrays;
import java.util.List;

public class Print {

    public static void main(String[] args) {
        Print p = new Print();
        List<String> list = Arrays.asList("first step", null, "second step ");

        for (String s:list) {
            try {
                p.print(s);
            } catch (NullPointerException ex){
                System.out.println(ex.getMessage());
                System.out.println("Exception was processed. Program continues! ");
            } finally {
                System.out.println("Inside block finally ");
            }
            System.out.println("Go program......");
            System.out.println("--------------");
        }

    }
    void print(String s) throws NullPointerException {
        if (s == null) {
            throw new NullPointerException("Exception:  input is null! ");
        }
        System.out.println("Inside method print: " + s);
    }
}
