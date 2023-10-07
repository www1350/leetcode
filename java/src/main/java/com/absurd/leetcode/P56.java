package com.absurd.leetcode;

import java.util.*;

/**
 * P56
 * 合并区间
 *
 * @author Absurd
 * @version 2023/10/06 22:20
 **/
public class P56 {
    /***
     * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
     * 请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
     *
     *
     *
     * 示例 1：
     *
     * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
     * 输出：[[1,6],[8,10],[15,18]]
     * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
     * 示例 2：
     *
     * 输入：intervals = [[1,4],[4,5]]
     * 输出：[[1,5]]
     * 解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。
     *
     *
     * 提示：
     *
     * 1 <= intervals.length <= 104
     * intervals[i].length == 2
     * 0 <= starti <= endi <= 104
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
//        List<int[]> result = new ArrayList<>();
//        BitSet bitSet = new BitSet();
//        // [1,3],[2,6],[8,10],[15,18]
//        int minv = Integer.MAX_VALUE;
//        int maxv = Integer.MIN_VALUE;
//        for(int i=0;i<intervals.length;i++){
//            bitSet.set(intervals[i][0],intervals[i][1]+1);
//            minv = intervals[i][0] < minv ? intervals[i][0]: minv;
//            maxv = intervals[i][1] > maxv ? intervals[i][1]: maxv;
//        }
//        // 0 1 2 3 4 5 6 7 ...
//        // 1~6 true
//        // 8~10 true
//        // 15~18 true
//        int left = minv;
//        int right = minv;
//        while (right < maxv){
//            left = bitSet.nextSetBit(left);
//            right = bitSet.nextClearBit(left);
//            int[] v = new int[2];
//            v[0] = left;
//            v[1] = right-1;
//            result.add(v);
//            left = right;
//        }
//        return result.toArray(new int[result.size()][]);
        // [1,4][5,6]//非重叠，位图不行
        // [[1,4],[0,4]]
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> result = new ArrayList<>();
        // [1,3],[2,6],[8,10],[15,18]
        for(int i=0;i<intervals.length;i++){
            int left = intervals[i][0];
            int right = intervals[i][1];
            if (i == 0 || result.get(result.size()-1)[1] < left){
                result.add(new int[]{left,right});
            }else {
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1], right);
            }
        }

        return result.toArray(new int[result.size()][]);

    }
}
