package com.azeem;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input =new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);
        //explicit type casting to convert bigger to small also kniwn as narrowing
//        float f =78.98f;
//        int n =(int)f;
//        System.out.println(n);
        //automatic type promotion  in expression
//        int a =257;
//        byte b=(int)a;//what gives is 257%256=1 give remainder when divided by 256 as b which is a integer type can only store till 256
//        System.out.println(b);
//        byte b=50;
//        b=b*2;//as now b become int so conversion not possible

//        int num='a';
//        System.out.println(num);

//        System.out.println(3*6);//float into int equals float basic things

        byte b=42;
        char c='a';
        short s=1024;
        int i =4999;
        float f=76.38f;
        double d=0.1234;
        double res=(f*b)+(i/c)-(d-s);
        System.out.println((f*b)+" "+(i/c)+" "+(d-s));
        //outuput float +int + double =double
        System.out.println(res);

    }
}
