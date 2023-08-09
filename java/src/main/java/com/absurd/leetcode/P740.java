package com.absurd.leetcode;

/***
 * 给你一个整数数组 nums ，你可以对它进行一些操作。
 *
 * 每次操作中，选择任意一个 nums[i] ，删除它并获得 nums[i] 的点数。之后，你必须删除 所有 等于 nums[i] - 1 和 nums[i] + 1 的元素。
 *
 * 开始你拥有 0 个点数。返回你能通过这些操作获得的最大点数。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [3,4,2]
 * 输出：6
 * 解释：
 * 删除 4 获得 4 个点数，因此 3 也被删除。
 * 之后，删除 2 获得 2 个点数。总共获得 6 个点数。
 * 示例 2：
 *
 * 输入：nums = [2,2,3,3,3,4]
 * 输出：9
 * 解释：
 * 删除 3 获得 3 个点数，接着要删除两个 2 和 4 。
 * 之后，再次删除 3 获得 3 个点数，再次删除 3 获得 3 个点数。
 * 总共获得 9 个点数。
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 2 * 104
 * 1 <= nums[i] <= 104
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/delete-and-earn
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P740 {
    public int deleteAndEarn(int[] nums) {
        //获得 nums[i] 的点数。之后，你必须删除 所有 等于 nums[i] - 1 和 nums[i] + 1 的元素。
        // 如果取nums[i]，所有相差1的都干掉了，那会取所有nums[i]
        // 转换为值作为下标，值为所有相同的叠加，相邻不能取
        // [2,2,3,3,3,4] -> [0,0,4,9,4]
        int maxVal = 0;
        for(int i=0;i<nums.length;i++){
            maxVal = Math.max(nums[i], maxVal);
        }
        int[] idxArr= new int[maxVal+1];
        for(int i=0;i<nums.length;i++){
            idxArr[nums[i]] += nums[i];
        }
        int[] dp = new int[maxVal+1];
        dp[0] = idxArr[0];
        dp[1] = Math.max(idxArr[0],  idxArr[1]);
        if(maxVal == 0){
            return dp[0];
        }
        for(int i=2;i<idxArr.length;i++){
            dp[i] = Math.max(dp[i-2]+idxArr[i],dp[i-1]);
        }
        return dp[idxArr.length-1];

    }
}
