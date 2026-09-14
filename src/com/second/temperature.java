package com.second;

import java.util.Scanner;

public class temperature {
    static void main(String[] args) {
        System.out.println("enetr temperature in celsius");
        Scanner input =new Scanner(System.in);
        float c=input.nextFloat();
        double temp=(c*9/5)+32;
        System.out.println("temp in fahrenheit is "+temp);
    }
}
