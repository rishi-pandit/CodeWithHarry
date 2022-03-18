package com.company;
import java.util.Scanner;

public class CWH_18_switch {
    public static void main(String[] args) {
        System.out.println("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();

        switch (age) {
            case 18 -> System.out.println("You are going to become an adult! ");
            case 21 -> System.out.println("You are able to thoking dhinchak-dhinchak  ");
            case 28 -> System.out.println("You are able to marry   !");
            case 30 -> System.out.println("You are able to allow baby   ..!");
            default -> System.out.println("Enjoy your life ..........!");
        }
    }
}
