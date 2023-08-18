package com.absurd.leetcode;

/**
 * @author Absurd
 * @version P495.java, v 0.1 2023年08月18日 17:22 Absurd
 */
public class P495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = 0;
        // [1,2,4] 2
        int lastTime = -1;
        for (int i = 0; i < timeSeries.length; i++) {
            int startTime = timeSeries[i];
            // 上一个区间囊括当前开始元素了，这次计算要从上一个区间最后一个元素+1开始，否则重叠多算
            if (lastTime >= timeSeries[i]){
                startTime = lastTime+1;
            }
            lastTime = timeSeries[i]+duration-1;
            result += (lastTime - startTime+1);

        }
        return result;
    }
}