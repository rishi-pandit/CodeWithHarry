//Write a Program to calculate percentage of a given student in CBSE board exam. His marks from 5 Suljects must be taken as input from the keyboard.
//
//        (Marks are out of 100).




package com.company;
import java.util.Scanner;

class Subject{
    int max = 100;
     int obt;
}

public class CBSEq {
    public static void main(String[] args){
        Subject s1 = new Subject();
        System.out.println("Enter Maths marks: ");
        Scanner scn = new Scanner(System.in);
        s1.obt = scn.nextInt();

        Subject s2 = new Subject();
        System.out.println("Enter Physics marks: ");

        s2.obt = scn.nextInt();

        Subject s3 = new Subject();
        System.out.println("Enter Chemistry marks: ");
        s3.obt = scn.nextInt();

        Subject s4 = new Subject();
        System.out.println("Enter Hindi marks: ");
        s4.obt = scn.nextInt();

        Subject s5 = new Subject();
        System.out.println("Enter English marks: ");
        s5.obt = scn.nextInt();

        int t = (s1.obt)+ (s2.obt)+ (s3.obt)+ (s4.obt)+ (s5.obt);
        int per = (t*100/500);
        System.out.println("Percentage obtained: "+per);
    }
}
