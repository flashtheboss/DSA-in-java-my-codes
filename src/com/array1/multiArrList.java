package com.array1;

import java.util.ArrayList;
import java.util.Scanner;

public class multiArrList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        // an arrray list containing three list same as two d array
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());//just creating spaces or three empty list with 0--2 index in list which is a multidimensional array lis
            //adding new is important as you are intializing with empty spaces
        }

        //adding array elemente
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());//you cant use get directly as you have to create list first
            }
        }
        System.out.println(list);
    }
}
