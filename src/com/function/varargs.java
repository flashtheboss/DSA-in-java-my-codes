package com.function;

import java.util.Arrays;//array class should be imported before doig things with arrays

public class varargs {
    public static void main(String[] args) {
        fun(1,3,67,98,23,767,9);
        //if no value passed then empty array would be printed
        multiple(3, 7, "Abdul", "Azeem", "Zuhaib");
    }
    static void multiple(int a ,int b,String ...w){
        System.out.println(a+" "+b+" "+Arrays.toString(w));
    }
    static void fun(int ...v){//to take more tha one argument or you can say variable of arguments
        System.out.println(Arrays.toString(v));
    }
}
