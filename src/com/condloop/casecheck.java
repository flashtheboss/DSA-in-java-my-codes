package com.condloop;
import java.util.Scanner;

public class casecheck {
    static void main(String[] args) {
        Scanner p =new Scanner(System.in);
        char c=p.next().trim().charAt(0);
        if (c>='a'&& c<='z'){
            System.out.println("uncap");}
        else if (c>='A'&&c<='Z') {
            System.out.println("cap");
        }
        else
            System.out.println("not a charachter");

        System.out.println(c);
    }
}