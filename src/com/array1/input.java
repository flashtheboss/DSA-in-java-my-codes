package com.array1;
import java.util.Scanner;
import java.util.Arrays;
public class input {
    static void main(String[] args) {
       // array of primitives meaning array of integer type value
        int[] x;int l;
        Scanner lsq = new Scanner(System.in);
//        System.out.println("Enter length of array");
//        l=lsq.nextInt();
//        x=new int[l];
//        //input using for loop
//        for(int i=0;i<x.length;i++){
//            x[i]=lsq.nextInt();
//        }
//        //to print array entered in string format
//        System.out.println(Arrays.toString(x));
//        //printing value one by one by for loop
//        for(int i=0;i<x.length;i++){
//            System.out.print(x[i]);
//        }
//        System.out.println();
//        // enhanced loop for same thing
//        for(int num:x){
//            System.out.print(num+"+");
//        }
        // array of object creation
        String[] y=new String[3];
        for(int i=0;i<y.length;i++){
            y[i]=lsq.next();
        }
        System.out.println(Arrays.toString(y));
    }
}
