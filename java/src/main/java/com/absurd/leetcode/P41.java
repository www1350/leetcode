package com.absurd.leetcode;

import java.util.BitSet;

/**
 * P41
 * 缺失的第一个正数
 *
 * @author Absurd
 * @version 2023/10/06 21:33
 **/
public class P41 {
    /***
     * 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
     *
     * 请你实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案。
     *
     *
     * 示例 1：
     *
     * 输入：nums = [1,2,0]
     * 输出：3
     * 示例 2：
     *
     * 输入：nums = [3,4,-1,1]
     * 输出：2
     * 示例 3：
     *
     * 输入：nums = [7,8,9,11,12]
     * 输出：1
     *
     *
     * 提示：
     *
     * 1 <= nums.length <= 5 * 105
     * -231 <= nums[i] <= 231 - 1
     */
    public int firstMissingPositive(int[] nums) {
        // 空间超出
//        BitSet bitSet = new BitSet();
//        for (int i=0;i<nums.length;i++){
//            if (nums[i]>0) {
//                bitSet.set(nums[i]);
//            }
//        }
//        return bitSet.nextClearBit(1);
        // 3,4,-1,1 -> 1(0) 2(1) 3(2) 4(3)
        // -1,4,3,1/-1,1,3,4/ 1,-1,3,4

        for (int i=0;i<nums.length;i++){
            while (nums[i]-1 >= 0 && nums[i]-1 < nums.length && nums[nums[i]-1] != nums[i]){
                int tmp = nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=tmp;
            }

        }
        for (int i=0;i<nums.length;i++){
            if (nums[i] != i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
}
