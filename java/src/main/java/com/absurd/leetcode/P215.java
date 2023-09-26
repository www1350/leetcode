package com.absurd.leetcode;

import java.util.PriorityQueue;

/**
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 *
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 * 你必须设计并实现时间复杂度为 O(n) 的算法解决此问题。
 *
 *
 *
 * 示例 1:
 *
 * 输入: [3,2,1,5,6,4], k = 2
 * 输出: 5
 * 示例 2:
 *
 * 输入: [3,2,3,1,2,4,5,5,6], k = 4
 * 输出: 4
 *
 *
 * 提示：
 *
 * 1 <= k <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * @author absurd
 * @version P215.java, v 0.1 2023年09月26日 11:31 absurd
 */
public class P215 {
    public int findKthLargest(int[] nums, int k) {
        // 大根堆
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int e : nums) {
            priorityQueue.offer(e);
        }
        int numK = nums[0];
        for(int i=0;i<k;i++){
            numK = priorityQueue.poll();
        }
        return numK;
    }
}