package com.binarysrch;

public class targetininfinitearray {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,30,40,50,66,70,89,90};
        int target=9;
        int ans=ans(arr,target);
        if(ans==-1){
            System.out.println("element does not exist");
        }
        else{
            System.out.println("element exist at position "+ans);
        }

    }
    static int ans(int[] nums,int target){
        int start=0;
        int end=1;
        while(target>nums[end]){
            //ek ek karke search space badhate jaa rahe hai
            //
            int temp=end+1;//abhi end agle line me change ho raha hai isiliye isko store kr liya baad me isiko start me daal denge last me
            end=end+(end-start+1)*2;// end = end+ boxsize*2
            start=temp;
        }
        return search(nums,target,start,end);//jab loop ko aisa chunk mil jaye jisme target ho tab bahar ake return ko dekhega aur search me chala jayeg
    }
    // binary search code
    static int search(int[] lums,int charget,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(charget<lums[mid]){
                end=mid-1;
            }
            else if(charget>lums[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
