package com.string;
import java.util.Scanner;
public class PALINDROME {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=s.next();
        int start=0;
        int end=s.length()-1;
        int count=0;
        while(start<=end){
            if((s.charAt(start))==(s.charAt(end))){
                start++;
                end--;
                continue;
            }
            else {
                count = 1;
                break;
            }
        }
        if(count==1){
            System.out.println("not palindrome");
        }
        else{
            System.out.println("palindorme");
        }
    }
}
