package com.absurd.leetcode;


/**
 * @author Absurd
 * @version LCR002.java, v 0.1 2023年08月25日 16:17 Absurd
 */
public class LCR002 {
    /***
     * 给定两个 01 字符串 a 和 b ，请计算它们的和，并以二进制字符串的形式输出。
     *
     * 输入为 非空 字符串且只包含数字 1 和 0。
     *
     * 示例 1:
     *
     * 输入: a = "11", b = "10"
     * 输出: "101"
     * 示例 2:
     *
     * 输入: a = "1010", b = "1011"
     * 输出: "10101"
     * 提示：
     *
     * 每个字符串仅由字符 '0' 或 '1' 组成。
     * 1 <= a.length, b.length <= 10^4
     * 字符串如果不是 "0" ，就都不含前导零。
     * 注意：本题与主站 67 题相同：https://leetcode-cn.com/problems/add-binary/
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int sum = 0;
        while (i>=0&&j>=0){
            int tmp = (a.charAt(i)-'0') + (b.charAt(j) -'0')+ sum;
            sum = tmp/2;
            tmp = tmp%2;
            stringBuilder.insert(0,(char) (tmp+'0'));
            i--;j--;
        }
        while (i>=0){
            int tmp = (a.charAt(i)-'0') + sum;
            sum = tmp/2;
            tmp = tmp%2;
            stringBuilder.insert(0,(char) (tmp+'0'));
            i--;
        }
        while (j>=0){
            int tmp = (b.charAt(j)-'0') + sum;
            sum = tmp/2;
            tmp = tmp%2;
            stringBuilder.insert(0,(char) (tmp+'0'));
            j--;
        }
        if (sum>0){
            stringBuilder.insert(0,(char) (sum+'0'));
        }
        return stringBuilder.toString();
    }
}