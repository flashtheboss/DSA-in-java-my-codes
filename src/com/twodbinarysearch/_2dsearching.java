package com.twodbinarysearch;

import java.util.Arrays;
public class _2dsearching {
    public static void main(String []args){
        int[][] data={{7,8,9},{10,11,12},{13,14,15}};
        int[] ans=search(data,13);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] cum,int target){
        int r=0,c=cum.length-1;
        while(r<cum.length && c>=0 ){
            if(cum[r][c]==target){
                return new int[]{r,c};
            }
            else if(cum[r][c]>target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
// ye row wise aur column wise sorted hai increasingly
// ye position dega target elemnt ki agar  nahi hai to -1,-1 aur ye integer matrix ke liiye hai
//ye square matrix ke liye hai...agar alag dimension ho to bas column aur row dekh lenge us hisaab se