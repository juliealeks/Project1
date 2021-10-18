package com.stepit.Practice10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

//        Pattern pattern = Pattern.compile("stepIt", Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher("Visit StepIT!");
//
//        boolean matchFound = matcher.find();
//
//        if (matchFound){
//            System.out.println("Match found!");
//        }else {
//            System.out.println("Match not found!");
        //      }
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun32"));
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","esdytarun32"));
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","aRun32"));
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","ar%%&*#32"));

//        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7123456789"));
//        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9123456789"));
//        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9123456789"));
//
//        System.out.println(Pattern.matches("[789][0-9]{9}", "9123a56789"));
//        System.out.println(Pattern.matches("[789][0-9]{9}", "91234567800"));
//        System.out.println(Pattern.matches("[789][0-9]{9}", "91 3456789"));
//
//        System.out.println(Pattern.matches("[789]{1}\\d{9}", "9123456789"));
//        System.out.println(Pattern.matches("[789]\\d{9}", "9123456789"));
//        System.out.println(Pattern.matches("[789]\\d{9}", "913456789"));
//
//        String EXAMPLE_TEXT = "This is an example of a text , please check if it got corrected successfully .";
//        String pattern1 = "(\\w)(\\s+)([\\.,])";
//        System.out.println(EXAMPLE_TEXT.replaceAll(pattern1, "$1$3"));

        final String EXAMPLE_TEXT1 = "This is my small example " + "string which I'm going to use for " + "pattern matching.";

//        System.out.println(EXAMPLE_TEXT1.matches("\\w.*"));
//        String[] splitString = EXAMPLE_TEXT1.split("\\s+");
//        System.out.println(splitString.length);
//        for (String string : splitString) {
//            System.out.println(string);
//        }
//        System.out.println(EXAMPLE_TEXT1.replaceAll("\\s+", "\t"));

//        System.out.println("Is True");
//        System.out.println(isTrue(EXAMPLE_TEXT1));
//        System.out.println("Is True or true");
//        System.out.println(isTrueV2(EXAMPLE_TEXT1));
//        System.out.println("Is True or true, Yes or yes");
//        System.out.println(isTrueV3(EXAMPLE_TEXT1));
//        System.out.println("contains true");
//        System.out.println(containsTrue(EXAMPLE_TEXT1));
//        System.out.println("contains ThreeLettersWords");
//        System.out.println(containsThreeLettersWords(EXAMPLE_TEXT1));
//    }

        Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile("([a-z0-9]+)@([a-z0-9_.-]+[a-z])");

        String TEXT_CONTAINING_EMAIL_ADDRESS = "You can contact me through emailtest@gmail.com, email_@hotbox.com, %%#5@gmail.com";

        Matcher countEmailMatcher = EMAIL_ADDRESS_PATTERN.matcher(TEXT_CONTAINING_EMAIL_ADDRESS);

        int count = 0;
        while (countEmailMatcher.find()) {
            count++;
        }
        System.out.println("count: " + count);
    }
    public static boolean isTrue(String s) {
        return s.matches("true");
    }

    public static boolean isTrueV2(String s) {
        return s.matches("[tT]rue");
    }

    public static boolean isTrueV3(String s) {
        return s.matches("[tT]rue|[yY]es");
    }
    public static boolean containsTrue(String s) {
        return s.matches(".*true.*");
    }
    public static boolean containsThreeLettersWords(String s) {
        return s.matches("[a-zA-Z]{3}");
    }
}