package com.array1;

public class MAX2 {
    public static void main(String[] args) {
        int[] x={2,4,6,8,0};
        System.out.println(max(x));
    }
    static int max(int[] x){
        if(x.length==0){//edge cases
            return -1;
        }
        int max=x[0];
        for(int i=1;i<x.length;i++){
            if (x[i]>max){
                max=x[i];
            }
        }
        return max;
    }
    //in a range max value
    //work on edge cases here like array is null
    //if end>start
    //{return -1;}
    //if arr==null
    //return -1;
//    static int max(int[] x,int start,int end){
//        int max=x[start];
//        for(int i=start;i<=end;i++){
//            if (x[i]>max){
//                max=x[i];
//            }
//        }
//        return max;
}
