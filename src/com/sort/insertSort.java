package com.sort;

public class insertSort {

    public static void inset_sort(int[] nums, int n){
        if (n < 1)return;

        for (int i = 1; i< n; i++){
            int value = nums[i];
            int j = i -1;

            //寻找位置
            for (;j>=0;--j){
                if (nums[j] > value)nums[j+1] = nums[j];
                else break;
            }

            nums[j+1] = value;
        }
    }

    public static int insert(int[] nums, int n){
        int x = 0;
        for (int i = 1; i < n; i++){

            int value = nums[i];
            int j = i -1;

            //找到插入点

            for (;j>=0;j--){
                if (nums[j] < value) {
                    x++;
                    nums[j+1] = nums[j];
                }
            }

            nums[j+1] = value;
        }
        return x;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{21,32,46,40,80,69,90,94};
//        inset_sort(arr,arr.length);
        System.out.println(insert(arr, arr.length));

    }
}









