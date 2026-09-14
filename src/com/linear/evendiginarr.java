package com.linear;

public class evendiginarr {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,4,754,-87,23,98};
        System.out.println(numbers(arr));
    }
    static int numbers(int[] nums){
        int count =0;
        for(int elem:nums){
            if(even(elem)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int elem){
        int numdig=numdig(elem);
        if(numdig%2==0){
            return true;
        }
        return false;//you can also right this in one statement like//return numdig%2;

    }
    static int numdig(int elem){
        int i=0;
        if(elem<0){
            elem=elem*-1;
        }
        while(elem>0){
            i++;
            elem/=10;
        }
        return i;
    }
}
