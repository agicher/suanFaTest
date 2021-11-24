package com.sort;

public class quickSort {
    public static void quick_sort(int[] nums, int l ,int r ){
        if ( l>= r)return;
        int i = l;
        int j = r;

        int temp = nums[l];
        //
        while (i < j){
            while ( nums[j] >= temp && i< j ) j --;
            while (nums[i] <= temp && i< j ) i ++ ;
            if (i < j){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        nums[l] = nums[i];
        nums[i] = temp;

        quick_sort(nums,l,j-1);
        quick_sort(nums,j+1,r);

    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19};
        quick_sort(arr,0,arr.length-1);
//      quick(arr,0,arr.length-1);
        for (int a :arr){
            System.out.println(a);
        }
    }
}
