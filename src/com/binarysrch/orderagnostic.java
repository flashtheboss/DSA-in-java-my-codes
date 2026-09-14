package com.binarysrch;

public class orderagnostic {
    public static void main(String[] args) {
        int[] array={5,5,5,5};
        int target=5;
        int ans=oagindexbs(array,target);
        if(ans==-1){
            System.out.println("array is empty");
        }
        else if(ans==-2){
            System.out.println("element does not exist");
        }
        else if(ans==-3){
            System.out.println("array has identical elemnt of "+target);
        }
        else{
            System.out.println("element exist on index number "+ans);
        }
    }
    static int oagindexbs(int[] nums,int t){
        int start=0;
        int end=nums.length-1;
        if(nums.length==0){
            return -1;
        }
        else {//whether elemnt exist or not
            if(nums[0]<nums[end]){//ascending array
                while(start<end){
                    int mid=start+(end-start)/2;
                    if(t<nums[mid]){
                        end=mid-1;
                    }
                    else if(t>nums[mid]){
                        start=mid+1;
                    }
                    else{
                        return mid;
                    }
                }
            }
            else if(nums[0]>nums[end]){//descending
                while(start<end){
                    int mid=start+(end-start)/2;
                    if(t<nums[mid]){
                        start=mid+1;
                    }
                    else if(t>nums[mid]){
                        end=mid-1;
                    }
                    else{
                        return mid;
                    }
                }
            }
            else{
                if(nums[0]==t){
                    return -3;
                }
                else{
                    return -2;

                }
            }
        }
        return -2;

    }
}
