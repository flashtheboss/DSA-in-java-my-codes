package com.linear;

public class findmin {
    static void main(String[] args) {
        int[] num = {1, 23, 56, 78, 92};
        System.out.println(min(num));

    }
    static int min(int[] n){
        int min=n[0];
        for(int i=0;i<n.length;i++){
            if(n[i]<min){
                min=n[i];
            }
        }
        return min;
    }
}

