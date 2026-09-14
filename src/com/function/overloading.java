package com.function;

public class overloading {
    static void main(String[] args) {
        fun(3);
        fun(" ");
        fun(5,6);
        //fun();//ambiguity as not provided which method or function to call
    }
    static void fun(int a){
        System.out.println(a);

    }
    static void fun(String x){
        System.out.println(x);
    }
    static void fun(int a,int b){
        System.out.println(a+" "+b);
    }
}
