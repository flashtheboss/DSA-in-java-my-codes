package com.binarysrch;

import java.util.Scanner;

public class findpivotofsortedpivotarray {
    public static void main(String[] args) {
        Scanner pu=new Scanner(System.in);
        System.out.println("Enter Array length");
        int l=pu.nextInt();
        int[] arr=new int[l];
        System.out.println("Enter your array element one by one with space between each element using space bar:");
        for(int i=0;i<l;i++){
            arr[i]=pu.nextInt();
        }
        pu.nextLine();//to clear other elemnt given in array more than length to give chance to usre to input target elemnt afterwards
        System.out.println("Enter your target element to find");
        int target=pu.nextInt();
        int r=pivot(arr);
        if(r==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Index of target element is "+r);
        }
    }
    static int pivot(int[] arr){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[0]){
                end=mid-1;
            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
