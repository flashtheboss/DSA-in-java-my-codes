package com.binarysrch;
/// this is for ascending order array not for order agnostic array

import java.util.Scanner;

public class floor {
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
        System.out.println("Enter your target element to find its floor in the provided array");
    int target=pu.nextInt();
    int r=BinarySearch(arr,target);
    if(r==-1){
        System.out.println("floor does not exist of given target element");
    }
    else{
        System.out.println("Index of floor of target target element is "+r+" and its value is "+arr[r]);
    }
    }
    static int BinarySearch(int[] num,int target){
        if(target<num[0]){
            return -1;
        }
        int start=0;
        int end=num.length-1;
        while(start<=end){
            //int mid=(start+end)/2;//this cannot be used for big integer values as it may exceed integer fixed value
            int mid=start+(end-start)/2;//tigdam lagaya basic maths use karke chaska llaga diya
            if(target<num[mid]){
                end=mid-1;
            }
            else if(target>num[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
