package com.absurd.leetcode;

/**
 * P1717
 *
 * @author Absurd
 * @version 2023/08/17 23:17
 **/
public class P1717 {
    /***
     * 给你一个字符串 s 和两个整数 x 和 y 。你可以执行下面两种操作任意次。
     *
     * 删除子字符串 "ab" 并得到 x 分。
     * 比方说，从 "cabxbae" 删除 ab ，得到 "cxbae" 。
     * 删除子字符串"ba" 并得到 y 分。
     * 比方说，从 "cabxbae" 删除 ba ，得到 "cabxe" 。
     * 请返回对 s 字符串执行上面操作若干次能得到的最大得分。
     *
     *
     *
     * 示例 1：
     *
     * 输入：s = "cdbcbbaaabab", x = 4, y = 5
     * 输出：19
     * 解释：
     * - 删除 "cdbcbbaaabab" 中加粗的 "ba" ，得到 s = "cdbcbbaaab" ，加 5 分。
     * - 删除 "cdbcbbaaab" 中加粗的 "ab" ，得到 s = "cdbcbbaa" ，加 4 分。
     * - 删除 "cdbcbbaa" 中加粗的 "ba" ，得到 s = "cdbcba" ，加 5 分。
     * - 删除 "cdbcba" 中加粗的 "ba" ，得到 s = "cdbc" ，加 5 分。
     * 总得分为 5 + 4 + 5 + 5 = 19 。
     * 示例 2：
     *
     * 输入：s = "aabbaaxybbaabb", x = 5, y = 4
     * 输出：20
     *
     *
     * 提示：
     *
     * 1 <= s.length <= 105
     * 1 <= x, y <= 104
     * s 只包含小写英文字母。
     * @param s
     * @param x
     * @param y
     * @return
     */
    public int maximumGain(String s, int x, int y) {
        String firstR = "ab";
        String secR = "ba";
        StringBuilder sbf = new StringBuilder(s);
        int maxi = x;
        int mini = y;
        int sum = 0;
        if (x < y){
            mini = x;
            maxi = y;
            firstR = "ba";
            secR = "ab";
        }

        // aabbaaxybbaabb
        // ab
        // abaaxybbaabb
        for(int i=1;i<sbf.length();i++){
            if (i < 1){
                continue;
            }
            if (firstR.charAt(1) == sbf.charAt(i) && firstR.charAt(0) == sbf.charAt(i-1)){
                sbf.deleteCharAt(i-1);
                sbf.deleteCharAt(i-1);
                sum += maxi;
                i=i-2;
            }
        }
        for(int i=1;i<sbf.length();i++){
            if (i < 1){
                continue;
            }
            if (secR.charAt(1) == sbf.charAt(i) && secR.charAt(0) == sbf.charAt(i-1)){
                sbf.deleteCharAt(i-1);
                sbf.deleteCharAt(i-1);
                sum += mini;
                i=i-2;
            }
        }
        return sum;
    }
}
