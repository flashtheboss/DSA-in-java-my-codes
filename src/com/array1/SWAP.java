package com.array1;
import java.util.Arrays;

public class SWAP {
   public static void main(String[] args) {
        int[] x={1,2,3,4,5,6};
        swap(x,1,3);
        System.out.println(Arrays.toString(x));

    }
    static void swap(int[] x,int a,int b){
        int temp=x[a];
        x[a]=x[b];
        x[b]=temp;
    }
}
