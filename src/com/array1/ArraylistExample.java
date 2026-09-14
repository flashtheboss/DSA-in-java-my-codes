package com.array1;


import java.util.ArrayList;
import java.util.Scanner;
public class ArraylistExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> kup = new ArrayList<>(10);//also if you want you write nothing in it like Arraylist kup=new ArrayList();
        //also <int> this is wrong as you cannot pass primitive you have to pass wrapper clas in it like Integer
//        kup.add(3);
//        kup.add(4);
//        kup.add(5);
//        kup.add(6);
//        kup.add(7);
//        kup.add(9);
        //you can add manually each data in arraylist add as many as you can
//        System.out.println(kup);
//        kup.set(0,87);//replace 0th index with 87
//        kup.remove(3);//removes index no 3
//        System.out.println(kup.contains(5));//checks if list contains 5 gives true or false
//        System.out.println(kup);

        //to take input from user in list
        for(int i=0;i<5;i++){
            kup.add(in.nextInt());//pass index here
        }
        //to print list element
        for(int i=0;i<5;i++){
            System.out.println(kup.get(i));//to get value at that index we use get() function
            //kup[] this snatx will not work here you have to use get function
        }
    }
}
