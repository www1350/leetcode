package com.absurd.leetcode;

/***
 * 给定一个长度为 n 的环形整数数组 nums ，返回 nums 的非空 子数组 的最大可能和 。
 *
 * 环形数组 意味着数组的末端将会与开头相连呈环状。形式上， nums[i] 的下一个元素是 nums[(i + 1) % n] ， nums[i] 的前一个元素是 nums[(i - 1 + n) % n] 。
 *
 * 子数组 最多只能包含固定缓冲区 nums 中的每个元素一次。形式上，对于子数组 nums[i], nums[i + 1], ..., nums[j] ，不存在 i <= k1, k2 <= j 其中 k1 % n == k2 % n 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,-2,3,-2]
 * 输出：3
 * 解释：从子数组 [3] 得到最大和 3
 * 示例 2：
 *
 * 输入：nums = [5,-3,5]
 * 输出：10
 * 解释：从子数组 [5,5] 得到最大和 5 + 5 = 10
 * 示例 3：
 *
 * 输入：nums = [3,-2,2,-3]
 * 输出：3
 * 解释：从子数组 [3] 和 [3,-2,2] 都可以得到最大和 3
 *  
 *
 * 提示：
 *
 * n == nums.length
 * 1 <= n <= 3 * 104
 * -3 * 104 <= nums[i] <= 3 * 104​​​​​​​
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/maximum-sum-circular-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P918 {
    public int maxSubarraySumCircular(int[] nums) {
        // [-1,3,-3,9,-6,8,-5,-5,-6,10]
        // 1、子序列没有跨界，求最大子序列和，
        // 2、子序列跨界，所有求和-最小子序列
        // 3、求两种情况哪种最大
        // 4、极端情况下全都是负的
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int maxVal = dp[0];
        int sum = nums[0];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            maxVal = Math.max(maxVal, dp[i]);
            sum+=nums[i];
        }
        dp[0] = nums[0];
        int minVal = dp[0];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Math.min(dp[i-1]+nums[i],nums[i]);
            minVal = Math.min(minVal, dp[i]);
        }

        return (sum - minVal == 0) ? maxVal : Math.max(sum - minVal, maxVal);

    }
}
