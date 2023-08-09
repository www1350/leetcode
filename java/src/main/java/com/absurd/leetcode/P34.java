package com.absurd.leetcode;

/****
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 *
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 * 示例 2：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 * 示例 3：
 *
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 *  
 *
 * 提示：
 *
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums 是一个非递减数组
 * -109 <= target <= 109
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P34 {
    public int[] searchRange(int[] nums, int target) {
        int searchIdx = searchIndex(nums, target);
        if(searchIdx == -1){
            return new int[]{-1,-1};
        }
        int minIdx = 0;
        for(int i=searchIdx;i>=0;i--){
            if(nums[i] == target){
                minIdx = i;
            }else{
                break;
            }
        }

        int maxIdx = 0;
        for(int i=searchIdx;i<nums.length;i++){
            if(nums[i] == target){
                maxIdx = i;
            }else{
                break;
            }
        }
        return new int[]{minIdx,maxIdx};
    }

    public int searchIndex(int[] nums, int target) {
        int minIdx = 0;
        int maxIdx = nums.length-1;
        int midIdx = minIdx+(maxIdx-minIdx)/2;
        while(minIdx <= maxIdx){
            if(nums[midIdx]>target){
                maxIdx = midIdx-1;
            }else if(nums[midIdx]<target){
                minIdx = midIdx+1;
            } else{
                return midIdx;
            }
            midIdx = minIdx+(maxIdx-minIdx)/2;
        }
        return -1;

    }
}
