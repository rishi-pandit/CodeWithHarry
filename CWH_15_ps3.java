package com.company;

import java.util.Locale;

public class CWH_15_ps3 {
    public static void main(String[] args) {
        // Problem 1
        String name = "Jack Packer";
        name = name.toLowerCase();
        System.out.println(name);

        // Problem 2
        String text = "To My    Friend";
        text = text.replace(" ", "_");
        System.out.println(text);

        //Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Sachine");
        System.out.println(letter);

        // Problem 4
        String myString = "This string contains double  and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String myLetter = "Dear Harry, \n\t This java course is nice. \n Thanks!";
        System.out.println(myLetter);
    }
}
