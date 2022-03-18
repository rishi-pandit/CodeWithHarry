package com.company;
import java.util.Scanner;

public class CWH_18_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age;
        age = sc.nextInt();
        if(age>56){
            System.out.println("You are experienced !");
        }
        else if(age>40)
        {
            System.out.println("You are semi-experienced!");
        }
        else if(age>30)
        {
            System.out.println("You are semi-semi-experienced!");
        }
        else if(age>18)
        {
            System.out.println("You are adult!");
        }
        else
        {
            System.out.println("You are child..........!         ok bachha.... samjhe ullu");
        }

        if(age>2)
        {
            System.out.println("You are not a baby..........!");
        }

    }
}
