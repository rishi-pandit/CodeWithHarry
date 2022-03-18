package com.company;
import java.util.Scanner;

public class CWH_25_practice_set_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // practice problem 1
//        int n=4;
//        for(int i=n;i>0;i--){
//            for(int j=0; j<i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //practice problem 2
//        int sum=0;
//        int n=10;
//        for(int i=0; i<n; i++){
//            System.out.println(2*i);
//            sum = sum + (2*i);
//        }
//        System.out.println("Sum of the even number is : " +sum);
        // first four even number is-> 0 2 4 6

        //practice problem 3
        // multiplication table of given number n
//        System.out.println("Enter input number : ");
//        int n = sc.nextInt();
//        for(int i=1; i<=10; i++){
//            System.out.println(n +"*" +i +"=" + n*i);
//        }

        // practice problem 4
        // multiplication table of given number n in reverse order
//        System.out.println("Enter input number : ");
//        int n = sc.nextInt();
//        for(int i=10; i>=1; i--){
//            System.out.println(n +"*" +i +"=" + n*i);
//        }

        // practice problem 6
        // factorial of given number
//        System.out.println("Enter input number : ");
//        int n = sc.nextInt();
//        // What is factorial n = n * n-1 * n-2 ..... 1
//        int i=1;
//        int factorial =1;
//        while(i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println("Factorial of a given number is : " +factorial);

        // practice problem 5
//        System.out.println("Enter input number : ");
//        int n = sc.nextInt();
//        int factorial = 1;
//        for(int i=1; i<=n; i++){
//            factorial *= i;
//        }
//        System.out.println("Factorial of a given number is : " +factorial);

        // practice problem 9
        System.out.println("Enter input number : ");
        int n = sc.nextInt();
        int sum =0;
        for(int i=1; i<=10; i++){
            System.out.println(n +"*" +i +"=" + n*i);
            sum += n*i;
        }
        System.out.println("Total sum is : " +sum);
    }
}
