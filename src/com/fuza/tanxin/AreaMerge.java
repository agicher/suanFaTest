package com.fuza.tanxin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 以数组 intervals 表示若干个区间的集合，
 * 其中单个区间为 intervals[i] = [starti, endi] 。
 * 请你合并所有重叠的区间，并返回一个不重叠的区间数组，
 * 该数组需恰好覆盖输入中的所有区间
 */
public class AreaMerge {
    //第一步  排序
    //第二步  判断 左右节点的关系

    public static int[][] merge(int[][] intervals){

        if (intervals.length == 0)return new int[0][2];
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        List<int[]> merge = new ArrayList<>();

        for (int i = 0 ; i < intervals.length;i++){
            int left = intervals[i][0];
            int right = intervals[i][1];

            if (merge.size() == 0 || merge.get(merge.size()-1)[1] < left) merge.add(new int[]{left,right});
            else merge.get(merge.size()-1)[1] = Math.max(merge.get(merge.size()-1)[1],right);
        }
        return merge.toArray(new int[merge.size()][]);
    }
}
