package com.company;

public class CWH_33_varargs {
//    static int add(int ...arr){
//        int result = 0;
//        for(int a: arr){
//            result += a;
//        }
//
//        return result;
//    }
//    public static void main(String[] args) {

//        System.out.println(add(1,2));
//        System.out.println(add(1,2,3));
//        System.out.println(add(1,2,3,4));
//        System.out.println(add(1,2,3,4,5));
//    }

    static int sum(int a,int b){
        return a+b;
    }

    static int sum(int a,int b,int c){
        return a+b+c;
    }

    static int sum(int a,int b,int c, int d){
        return a+b+c+d;
    }

    static int sum(int a,int b,int c, int d,int e){
        return a+b+c+d+e;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");

        System.out.println("The sum of 4 and 5 is: " +sum(4,5));
        System.out.println("The sum of 4 and 5 is: " +sum(4,5, 6));
        System.out.println("The sum of 4 and 5 is: " +sum(4,5,9,8));
        System.out.println("The sum of 4 and 5 is: " +sum(4,5,5,8,10));
    }
}
