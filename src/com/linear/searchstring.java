package com.linear;
import java.util.Arrays;

public class searchstring {
    public static void main(String[] args) {
        String name= "Abdul Azeem";//teaches space as space
        char target='A';
        //System.out.println(search1(name,target));//calling search 1 no conversion to array
        System.out.println(search2(name,target));//calling advance loop array
        //System.out.println(Arrays.toString(name.toCharArray()));//to conevert an string into character array and print in form of string (using to string metod)
    }
    static boolean search1(String n,char target){
        if(n.length()==0){
            return false;
        }
        for(int i=0;i<n.length();i++){
            if(target==n.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean search2(String n,char target){
        if(n.length()==0){
            return false;
        }
        for(char c:n.toCharArray()){//advance loop to check each elemnt of char array and compare it
            if(target==c){
                return true;
            }
        }
        return false;
    }

}
