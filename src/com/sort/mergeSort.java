package com.sort;

/**
 * 分治算法
 *
 * 先找出分区点 划分区域
 * 然后细分，算出每个小区域的结果
 *
 * 最后归并
 */
public class mergeSort {


    public static void merge_sort_test(int[] a, int l, int r){
        if (l>=r)return;
        int mid = (l+r)/2;
        merge_sort_test(a,l,mid);
        merge_sort_test(a,mid+1,r);
        merge_test(a,l,mid,r);
    }
    public static void merge_test(int[] a, int l, int mid, int r) {
        int i = l, j = mid+1, k=0;
        int[] tmp = new int[r - l +1];

        while ( i<= mid && j <= r){
            if (a[i] <= a[j]) tmp[k++] = a[i++];
            else{
                tmp[k++] = a[j++];
            }
        }

        while (i<=mid) tmp[k++] = a[i++];
        while (j<=r) tmp[k++] = a[j++];

        for (i = 0 ; i <=r-l; i++) a[l+i] = tmp[i];
    }



    public static void main(String[] args) {
        int[] arr = new int[]{10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19};
//        merge_sort_test(arr,0,arr.length-1);
//sort(arr,0,arr.length-1);

        for (int a: arr) System.out.println(a);
    }
}
