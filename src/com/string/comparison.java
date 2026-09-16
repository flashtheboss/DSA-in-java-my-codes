package com.string;

public class comparison {
    public static void main(String[] args) {
        String a="azeem";
        String b="azeem";
        System.out.println(a==b);
        String c=a;
        System.out.println(c==a);//willl give true beacuse c also points to same string
        // its a comparison operator to check whether variable points to same object or not
        String name1=new String("abdul");
        String name2=new String("abdul");
        System.out.println(name1==name2);//this is compartaive function this compare object
        System.out.println(name1.equals(name2));//will compare actual values stored inside the function//
        System.out.println(name1.charAt(1));//to find index value of given string
    }
}
