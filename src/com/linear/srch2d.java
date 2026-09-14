package com.linear;
import java.util.Scanner;
import java.util.Arrays;

public class srch2d {
    public static void main(String[] args) {
        int[][] num={{1,2,3},{5,4,3},{7,6,5}};//
        Scanner np=new Scanner(System.in);
        int target=np.nextInt();
       // System.out.println(search(num,target));
        int[] ans =search(num,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] n,int t){
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                if(t==n[i][j]){
                    return new int[]{i,j};//tor return exact location where target element iis present in form of array
                    //return true;  //if we want tor return value in boolean
                }
            }
        }
        return new int[0];//or return new int[]{-1,-1};
    }
}
//smae code can be used to find max and min value with slight variation