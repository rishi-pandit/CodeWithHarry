package com.company;
import java.util.Scanner;

public class CWH_34_recursion {
    static long factorial(long n){
        if(n==0 || n==1)
        {
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    static int factorial_iterative(int n){
        if(n==0 || n==1)
        {
            return 1;
        }
        else{
            int product = 1;
            for(int i=1; i<=n; i++){
                product *= i;
            }

            return product;
        }
    }
    public static void main(String[] args) {
        System.out.println("Taking Input from the User ");
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int a =sc.nextInt();

        System.out.println("The value of factorial x is : " +factorial(x));
        System.out.println("The value of factorial_iterative x is : " +factorial_iterative(a));
    }
}
