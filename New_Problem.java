package com.company;
import java.util.Scanner;

public class New_Problem {
    static int GCD(int a, int b){
        if(a==0){
            return b;
        }
        return GCD(b%a,a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         int count =1;

        if(a>0 & a<(10*12+1) & b>=1 & b<(10*12+1)){
           for(int i=2; i<= GCD(a,b)+1; i++){
               if(a%i==0 & b%i==0){
                   count += 1;
               }
           }

            System.out.println("The number of common factor is : " +count);
        }

    }
}
