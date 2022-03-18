package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class CWH_29_practice_Set_6 {
    public static void main(String[] args) {
        //practice problem 1
//        float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
//        float sum=0;
//        for(float element:marks){
//            sum += element;
//        }
//        System.out.println("The value of sum is " +sum);

        //practice problem 2
        // to given integer is present in array or not
//        float []marks ={45.7f,67.8f,63.4f,99.2f,100.0f};
//        float num = 45.57f;
//        boolean isInArray = false;
//        for(float element: marks){
//            if(num==element){
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray) {
//
//            System.out.println("The value is present in the array");
//        }else {
//            System.out.println("the value is not present in the array");
//        }

        // Practice problem 3
//        float []marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        float sum =0;
//        for(float element : marks){
//            sum += element;
//        }
//        System.out.println("The value of the average marks is " +sum/marks.length);

        //Practice problem 4
//        int [][] mat1 = {{1,2,3},
//                          {4,5,6}};
//        int [][] mat2 = {{2,6,13},
//                         {3,7,1}};
//        int [][] result = {{0,0,0},
//                           {0,0,0}};
//        for(int i=0; i<mat1.length; i++){// row number of times
//            for(int j=0; j<mat1[i].length; j++){// column number of times
//                System.out.format("Setting value for i=%d and j=%d\n",i,j);
//                result[i][j]= mat1[i][j] + mat2[i][j];
//            }
//        }
//
//        // Printing the elements of a 2-D Array
//        for(int i=0; i<mat1.length; i++){// row number of times
//            for(int j=0; j<mat1[i].length; j++){// column number of time
//                System.out.print(result[i][j] +" ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println(""); // print a new line
//        }

        //Practice problem 5
//        int [] arr ={1,21,3,4,5,34,67};
//        int l =arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//
//        for(int i=0; i<n; i++){
//            //Swap a[i] and a[l-1-i]
//            // a b temp
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//
//        for(int element: arr){
//            System.out.println(element + " ");
//        }

        //Practice problem 6
//        int []arr = {1,2100,36,56,89,45,5258,252,525,62,5,325,52,62,5,6,25655,25};
//        int max = Integer.MIN_VALUE;
//        for(int e: arr){
//            if(e>max){
//                max=e;
//            }
//        }
//        System.out.println("the value of tme maximum element in the array :  "+max);
//
//        //Practice problem 6
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);

       // Practice Problem 7
//        int []arr = {1,2100,36,56,89,45,5258,252,525,62,5,325,52,62,5,6,25655,25};
//        int min = Integer.MAX_VALUE;
//        for(int e: arr){
//            if(e<min){
//                min=e;
//            }
//        }
//        System.out.println("the value of tme minimum element in the array :  "+min);

        //Practice Problem 8
        boolean isSorted = true;
        int [] arr= {1,12,3,4,5,34,67};
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                isSorted = false ;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }

    }
}
