package com.condloop;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner l =new Scanner(System.in);
        System.out.println("Enter number of terms in fibonacci series to be printed");
        int n = l.nextInt();
        int a=0,b=1,count=2,temp;
        System.out.print(a+" "+b);
        while(count<=n){
            temp=b;
            b=b+a;
            a=temp;
            System.out.print(" "+b);
            count++;
        }


}
}
