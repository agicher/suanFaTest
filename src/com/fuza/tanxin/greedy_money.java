package com.fuza.tanxin;

import java.util.ArrayList;
import java.util.Arrays;

public class greedy_money {
//             1、题目：指定币值和相应的数量，用最少的数量凑齐某金额。
//            2、思路：利用贪心算法，我们优先选择面值大的钱币，以此类推，直到凑齐总金额。

    public  static int[] getNumber(int sum , int[] values, int[] counts){


        for (int i = 0; i<values.length;i++){
            counts[i] = sum / values[i];
            sum %= values[i];
        }
        return counts;
    }

    public static void main(String[] args) {
        int[] number = getNumber(99, new int[]{50, 20, 10, 5, 1}, new int[5]);
        System.out.println(Arrays.toString(number));
    }
}
