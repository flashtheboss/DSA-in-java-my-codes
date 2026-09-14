package com.array1;
import java.util.Scanner;
import java.util.Arrays;

public class reverse {
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
        if(l%2==0){
            for(int i=0;i<(l/2);i++){
                swap(arrar,i,l-1-i);
            }
        }
        else{
            for(int j=0;j<(((l-1)/2));j++){
                swap(arrar,j,l-1-j);

            }
        }
        return arrar;

    }
    static void swap(int[] y,int r,int s){
        int temp=y[r];
        y[r]=y[s];
        y[s]=temp;
    }
}
