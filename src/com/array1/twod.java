package com.array1;
import java.util.Arrays;
import java.util.Scanner;


public class twod {
    public static void main(String[] args) {
        Scanner rup=new Scanner(System.in);
        //array creation two d
       // int[][] x=new int[3][];
        //or
//        int[][] x={{1,2,3},//o index
//                {4,7},
//                {7,9,79,8}};//2nd index x[2]={7,9,79,8}
//        System.out.println(Arrays.toString(x));
        //input
        int [][] lub =new int[3][3];
        int count=1;
        //System.out.println(lub.length);//wll give rows in that two d array that is 3
        for(int row=0;row<lub.length;row++){
            System.out.println("Enter "+count+" row element");
            for(int col=0;col<lub[row].length;col++){
                lub[row][col]=rup.nextInt();
            }
            count++;
        }
        //to give output
//        count=1;
//        for(int row=0;row<lub.length;row++){
//            System.out.println("print "+count+" row element");
//            for(int col=0;col<lub[row].length;col++){
//                System.out.print(lub[row][col]+" ");
//            }
//            System.out.println();
//            count++;
//        }
        //OUTPUT OTHEER WAY
        //using array.toString
//        for(int row=0;row<lub.length;row++){
//            System.out.println(Arrays.toString(lub[row]));
//        }
        //to print each integer with enhanced loop
        for(int[] num:lub){//as every single elemet in this array is itself an array
            System.out.println(Arrays.toString(num));

        }




    }
}
