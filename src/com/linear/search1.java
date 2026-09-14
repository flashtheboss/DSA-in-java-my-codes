package com.linear;

public class search1 {
    public static void main(String[] args){
        int[] num={1,2,3,4,5,6,7,8,9,11};
        int target=1;
        int ans=linearsrch(num,target);
        System.out.println(ans);
    }
    static int linearsrch(int[] n,int t){
        if(n.length==0){
            return-1;
        }
        else{
            for(int i=0;i<n.length;i++){
                if(n[i]==t){
                    return i;
                }
            }
            return -1;
        }
    }
}
