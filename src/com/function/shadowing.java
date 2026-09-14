package com.function;

public class shadowing {
    static int x=90;//this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);
        int x;//this has scope oly in main function
       // System.out.println(x);//scope of a variable begins once it is initialized
        x=40;
        System.out.println(x);//now it is good as no problem
        fun();
    }

    static void fun()
    {
        System.out.println(x);
    }
}
