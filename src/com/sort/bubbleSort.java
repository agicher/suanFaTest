package com.sort;

public class bubbleSort {

    public static void sort(int[] nums, int n){

        for (int i = 0;  i < n; i++){
            boolean flag = false;
            for (int j = 0; j < n -i -1 ;j++){
                if (nums[j] < nums[j+1]){
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                    flag = true;
                }

            }
            if (!flag) break;
        }
    }

    public static void bubble(int[] nums, int n){
        for (int i = 0; i<  nums.length;i++){
            boolean flag = false;
            for ( int j = 0; j < n-i-1;j++){
                if (nums[j+1] < nums[j]){
                    int t =  nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = t;
                    flag = true;
                }
            }
            if (!flag) return;
        }
    }



    public static void main(String[] args) {
        int[] arr = new int[]{10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19};
      bubble(arr,arr.length);
        for (int a: arr) System.out.println(a);
    }
}
