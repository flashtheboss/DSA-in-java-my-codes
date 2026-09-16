package com.string;
import java.util.Arrays;

public class output {
    public static void main(String[] args) {
        System.out.println(78);
        System.out.println("azeem");
        System.out.println(new int[]{1,2,3,4,5,6,7,8});//will print random value beacause ..its calling function with object null
        System.out.println(Arrays.toString(new int[]{1,2,3,4,5,6,7,8}));
        String name=null;
        System.out.println(name);
    }
}
