package com.sorting;

import java.util.Arrays;

public class sorting_diff_methods {
    public static void main(String[] args){
        int[] array={5,3,4,1,-29};
        insertion(array);
        System.out.println(Arrays.toString(array));
    }
    static void insertion(int[] array){
        int n=array.length;
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j>0;j--){
                if (array[j] <array[j-1]){
                    swap(array,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void selection(int[] array){
        // isme max nikaalenge ya minimum nikalenge fir usko last ya first wale se exchnge krenge ..bubble e swap krte krte last tak phuchate the...isme max nikkal ke last ya min nikaal ke phle rakh dennge..depend krta hai ki ascending me krna hai ki descending me
        //ye loop chalega utni baar jinte yaha pe elements hai
        for(int i=0;i<=array.length-1;i++){
            int last =array.length-i-1;//ye last position hai jisse replace hoga har baar//depend krega ki aap minimum phle sort krrhe ya max jo ki last pe hoga
            int max=getmaxindex(array,0,last);
            swap(array,max,last);
        }
    }
    //for swap function
    static void swap(int[] array,int max,int last){
        int temp=array[max];
        array[max]=array[last];
        array[last]=temp;
    }
    //for getting maximum index in array from start and end given
    static int getmaxindex(int[] array,int first,int last){
        int max=first;
        for(int i=0;i<=last;i++){
            if(array[i]>array[max]){
                max=i;
            }
        }
        return max;
    }
    static void bubble(int[] array){
        // taking this swaped variable for checking case if anything is swapped or not for a particular value of i...if not then break will happen and there will be no need for swapping
        boolean swapped;
        // running this loop n-1 times as it is bubbe sort algorithm...sorting will be done one by one
        for(int i=0;i<array.length-1;i++){
            swapped=false;
            //inner loop for running on elements which will remain unsorted
            for(int j=1;j<array.length-i;j++){
            //swap elements if first previous one is smaller than next element..this code is for ascending
              order sorting
                if(array[j]<array[j-1]){
                    int temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                    swapped=true;
                }
            }
            //agar swapping nahi ho rahi matlab phle se hi sorted hai ascending order me
            if(!swapped){
                break;
            }

        }

    }

}
