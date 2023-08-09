package com.absurd.leetcode;

/***
 * 给定一个整数数组prices，其中第  prices[i] 表示第 i 天的股票价格 。​
 *
 * 设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
 *
 * 卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: prices = [1,2,3,0,2]
 * 输出: 3
 * 解释: 对应的交易状态为: [买入, 卖出, 冷冻期, 买入, 卖出]
 * 示例 2:
 *
 * 输入: prices = [1]
 * 输出: 0
 *  
 *
 * 提示：
 *
 * 1 <= prices.length <= 5000
 * 0 <= prices[i] <= 1000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-with-cooldown
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P309 {
    public int maxProfit(int[] prices) {
        // 1,2,3,0,2
        //
        if(prices.length == 1){
            return 0;
        }
        //dp[i][0] 表示到第i天最后操作是买（持有股票）时最大收益
        //dp[i][1] 表示到第i天没有股票，今天刚卖的最大收益
        //dp[i][2] 表示到第i天不持有股票不在冷冻期（不是今天卖）的最大收益
        int[][] dp = new int[prices.length][3];
        // 第一天收益为负的，持有股票
        dp[0][0] = -prices[0];
        for(int i=1;i<prices.length;i++){
            // 前一天持有股票不操作跟前一天不处于冷冻期今天新买一支收益比较
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][2]-prices[i]);
            // 昨天持有股票，今天卖出，接下来一天处于冷冻期，收益今天赚
            dp[i][1]=dp[i-1][0]+prices[i];
            // 前一天刚卖或者前一天跟今天一样不做操作
            dp[i][2]=Math.max(dp[i-1][1],dp[i-1][2]);
        }

        return Math.max(dp[prices.length-1][1],dp[prices.length-1][2]);

    }
}
