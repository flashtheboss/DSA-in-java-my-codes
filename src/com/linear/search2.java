
package com.linear;

public class search2 {
    public static void main(String[] args){
        int[] num={1,2,3,4,5,6,7,8,9,11};
        int target=12;
        int ans=linearsrch(num,target);
        System.out.println(ans);
    }
    static int linearsrch(int[] n,int t){
        if(n.length==0){
            return Integer.MAX_VALUE;
        }
        else{
            for(int i=0;i<n.length;i++){
                if(n[i]==t){
                    return n[i];//how we know that -1 returned is what?? is it -1 element ina rray or -1 default what we set to return
                }
            }
            return Integer.MAX_VALUE;//
        }
    }
    //WE can also return boolean values true or false int place of integer max value and where we reaturn the value which was our target
}
