package com.array1;

public class MAX {
    public static void main(String[] args) {
        int[] x={2,4,6,8,0};
        max(x);
    }
    static void max(int[] x){
        int max=x[0];
        for(int i=1;i<x.length;i++){
            if (x[i]>max){
                max=x[i];
            }
        }
        System.out.println(max);
    }
}
