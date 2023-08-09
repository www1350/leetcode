package com.absurd.leetcode;

/***
 * 给你一个整数数组 nums ，请你求出乘积为正数的最长子数组的长度。
 *
 * 一个数组的子数组是由原数组中零个或者更多个连续数字组成的数组。
 *
 * 请你返回乘积为正数的最长子数组长度。
 *
 *  
 *
 * 示例  1：
 *
 * 输入：nums = [1,-2,-3,4]
 * 输出：4
 * 解释：数组本身乘积就是正数，值为 24 。
 * 示例 2：
 *
 * 输入：nums = [0,1,-2,-3,-4]
 * 输出：3
 * 解释：最长乘积为正数的子数组为 [1,-2,-3] ，乘积为 6 。
 * 注意，我们不能把 0 也包括到子数组中，因为这样乘积为 0 ，不是正数。
 * 示例 3：
 *
 * 输入：nums = [-1,-2,-3,0,1]
 * 输出：2
 * 解释：乘积为正数的最长子数组是 [-1,-2] 或者 [-2,-3] 。
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/maximum-length-of-subarray-with-positive-product
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P1567 {

    public int getMaxLen(int[] nums) {
        // 1,-2,-3,4
        // +1,0,3,4
        // -0,2,1,2
        int[] pos = new int[nums.length];
        int[] nei = new int[nums.length];
        if(nums[0] > 0){
            pos[0] = 1;
        }else if(nums[0] < 0){
            nei[0] = 1;
        }
        int max = pos[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>0){
                pos[i] = pos[i-1]+1;
                nei[i] = nei[i-1] > 0 ? (nei[i-1]+1) :0;
            }else if(nums[i]<0){
                nei[i] = pos[i-1]+1;
                pos[i] = nei[i-1] > 0 ? (nei[i-1]+1) :0;
            }else{
                pos[i] = nei[i] = 0;
            }
            max = Math.max(max,pos[i]);
        }
        return max;

    }
}
