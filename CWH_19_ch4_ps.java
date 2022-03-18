package com.company;
import java.util.Scanner;

public class CWH_19_ch4_ps {
    public static void main(String[] args) {
        // question 1
//        int a=10;
//        if(a==11){
//            System.out.println("I am 11");
//        }
//        else
//        {
//            System.out.println("I am not 11");
//        }

        // Question 2

//        byte m1,m2,m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks of physics  : ");
//        m1 = sc.nextByte();
//
//        System.out.println("Enter your marks in chemistry  : ");
//        m2 = sc.nextByte();
//
//        System.out.println("Enter your marks in mathematica  : ");
//        m3 = sc.nextByte();
//
//        float avg = (m1 + m2 + m3)/3.0f;
//        System.out.println("Your overall percentage is  : " + avg);
//
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulation, you have been promoted  !");
//        }
//        else{
//            System.out.println("Sorry , you have been not promoted   !");
//        }

       // Question 3

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in lakhs per annum :  ");
//        float income = sc.nextFloat();
//        float tax = 0;
//
//        if(income <= 2.5f){
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income <= 5f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income <= 10.0f){
//            tax = tax + 0.05f * (income - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (income - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//            tax = tax + 0.3f * (income - 10.0f );
//        }
//
//        System.out.println("The total tax paid by the employee is : " +tax);

       // Question 4

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter date : ");
//        int day = sc.nextInt();
//
//        switch(day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

       // Question 5

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter  year :  ");
//        int year = sc.nextInt();
//        if(year % 4 == 0){
//            System.out.println("Entered year is a Leap year  !");
//        }
//        else
//        {
//            System.out.println("Entered year is not a Leap year  !");
//        }
//
//        System.out.println("Enjoy your life  !");

       // Question 6

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your website name  : ");
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an Organisational website  !");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a Commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website  !");
        }

        System.out.println("Enjoy your life  !");



    }
}
