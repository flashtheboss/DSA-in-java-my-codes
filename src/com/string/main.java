package com.string;

public class main {
    public static void main(String[] args){
    String a="kunal";//object created in string pool//also tell that strings are immutable because of security reason
    System.out.println(a);
    a="kushwaha";//object didnt changed but a new object is created //and old object if not anyone pointing ...picked by garbagae collector
    System.out.println(a);
    }
}
