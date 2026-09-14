package com.condloop;

import java.util.Scanner;

public class reverse
{
	public static void main(String[]args)
	{
		int original,dig,sum=0;
		Scanner lop =new Scanner(System.in);
		System.out.println("Enter a number to print its reverse number");
		int num = lop.nextInt();
		original=num;
		while(num>0)
		{
			dig=num%10;
			sum=sum*10+dig;
			num/=10;
			
		}
		System.out.println("Your reverse number of"+original+"is"+sum);
	}
}

