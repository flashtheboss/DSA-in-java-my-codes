package com.array1;

import java.util.Arrays;
import java.util.Scanner;

public class reverse2 {
    public static void main(String[] args) {
        int[] x;int l;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter lenght of integer array");
        l=in.nextInt();
        x=new int[l];
        System.out.println("Enter array ");
        for(int i=0;i<l;i++){
            x[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(reverse(x)));

    }
    static int[] reverse(int[] arrar){
        int l=arrar.length;
        int start=0;
        int end =l-1;
        while(start<end){
            swap(arrar,start,end);
            start++;
            end--;
        }
        return arrar;

    }
    static void swap(int[] y,int r,int s){
        int temp=y[r];
        y[r]=y[s];
        y[s]=temp;
    }
}
