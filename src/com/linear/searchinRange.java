package com.linear;

public class searchinRange {
    public static void main(String[] args) {
        int[] num={18,2,45,61,14,25,-8};
        int target=34;
        System.out.println(linearsrch(num,target,1,4));

    }
    static  int linearsrch(int[] n,int t,int start,int end){
        if(n.length==0){
            return -1;
        }
        else{
            for(int i=start;i<end;i++){
                if(n[i]==t){
                    return i;//how we know that -1 returned is what?? is it -1 element ina rray or -1 default what we set to return
                }
            }
            return -1;//
        }
    }
}
