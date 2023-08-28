package com.absurd.leetcode;

/**
 * @author Absurd
 * @version P322.java, v 0.1 2023年08月28日 19:35 Absurd
 */
public class P322 {
    /***
     * 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。
     *
     * 计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回 -1 。
     *
     * 你可以认为每种硬币的数量是无限的。
     *
     *
     *
     * 示例 1：
     *
     * 输入：coins = [1, 2, 5], amount = 11
     * 输出：3
     * 解释：11 = 5 + 5 + 1
     * 示例 2：
     *
     * 输入：coins = [2], amount = 3
     * 输出：-1
     * 示例 3：
     *
     * 输入：coins = [1], amount = 0
     * 输出：0
     *
     *
     * 提示：
     *
     * 1 <= coins.length <= 12
     * 1 <= coins[i] <= 231 - 1
     * 0 <= amount <= 104
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange(int[] coins, int amount) {
        if (amount == 0){
            return 0;
        }

        // dp 状态定义:dp[i]表示不超过总金额i的最少硬币个数
        int[] dp = new int[amount+1];

        // 初始化:第一列都是MAX
        for (int i = 1; i < dp.length ; i++) {
            dp[i] = amount+1;
        }

        for(int i=0;i<coins.length;i++){
            for (int j=0;j<=amount;j++){
                //
                if (coins[i] <= j){
                    dp[j]=Math.min(dp[j], dp[j-coins[i]]+1);
                }
            }
        }
        return dp[amount] > amount ?  -1 :dp[amount];
    }
}