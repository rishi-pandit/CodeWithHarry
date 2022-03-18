package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class CWH_17_logical {
    public static void main(String[] args) {
        System.out.println("For Logical And...");
        boolean a = true;
        boolean b = false;
        if(a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println("For Logical OR..");

        if(a || b){
            System.out.println("Y");
        }
        else
        {
            System.out.println("N");
        }

        System.out.println("For Logical Not");
        System.out.println("Not(a) is  ");
        System.out.println(!a);
        System.out.println("Not(b) is");
        System.out.println(!b);
    }
}
