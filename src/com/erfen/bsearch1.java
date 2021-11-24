package com.erfen;

public class bsearch1 {

    public static int bsearch_1(int[] nums, int value){
        int r = nums.length - 1;
        int l = 0;

        while (l<=r){
            int mid = l + (r - l)/2;
            if (nums[mid] == value) return mid;
            else if (nums[mid] < value) l = mid +1;
            else r = mid -1;
        }

        return -1;
    }

    //查找第一个值等于给定值的元素

    public static int bsearch_2(int[] nums, int value){
        int l = 0;
        int r = nums.length - 1;

        while (l<=r){
            int mid = l + (r - l)/2;
            if (nums[mid] == value){
                if (mid == 0 || nums[mid - 1] != nums[mid]) return mid;
                r = mid - 1;
            }
            else if (nums[mid] > value) r = mid -1;
            else l = mid + 1;
        }
        return -1;
    }

    //查找最后一个值等于给定值的元素
    public static int bsearch_3(int[] nums, int value){
        int l = 0;
        int r = nums.length - 1;

        while (l<=r){
            int mid = l + (r - l)/2;
            if (nums[mid] == value){
                if (mid == nums.length - 1 ||  nums[mid +1] != value) return mid;
                l = mid + 1;
            }else  if (nums[mid] < value) l = mid +1;
            else r = mid - 1;
        }
        return  - 1;
    }

    //查找第一个大于等于给定值的元素

    public static int bsearch_4(int[] nums, int value){
        int l = 0;
        int r = nums.length - 1;

        while (l<=r){
            int mid = l + (r - l)/2;
            if (nums[mid] >= value ){
                if (mid == 0 || nums[mid - 1] < value) return mid;
                else r = mid - 1;
            }else l = mid + 1;
        }
        return  - 1;
    }








    public static void main(String[] args) {
        int[] a1 = new int[]{1,1,3,4,5};
        int[] a2 = new int[]{1,1,1,1,1};
        int[] a3 = new int[]{0,1,1,3,3,3};

//        System.out.println(bsearch_1(a1, 1));
        System.out.println(bsearch_3(a2, 0));
        System.out.println(bsearch_3(a3, 1));


    }
}
