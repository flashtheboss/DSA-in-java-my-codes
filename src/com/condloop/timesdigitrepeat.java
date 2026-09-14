package com.condloop;

import java.util.Scanner;

public class timesdigitrepeat 
{
    public static void main(String[]args)
    {
	    Scanner low =new Scanner(System.in);
	    System.out.println("Enter a integer number");
	    int num =low.nextInt();
	    while(true)
	    {
	        System.out.println("Digit to be checked that how many tiimes it is repeated in that number input by user");
	        int rep =low.nextInt();
	        if (rep>=0 && rep<=9)
		{
		    int count =0,dig,orig=num;
		    while(num>0)
		    {
		        dig=num%10;
			num=num/10;
			if (dig==rep)
			{
			    count++;
			}
		    }
		    System.out.println("Numbers of time digit "+rep+"is repeated is "+count);
		    break;
		}
		else
		{
		System.out.println("Invalid digit to be checked enter again");
		}
	    }
    }
}
