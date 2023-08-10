package com.absurd.leetcode;

/**
 * P14
 *
 * @author Absurd
 * @version 2023/08/10 22:24
 **/
public class P14 {
    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     *
     * 如果不存在公共前缀，返回空字符串 ""。
     *
     *
     *
     * 示例 1：
     *
     * 输入：strs = ["flower","flow","flight"]
     * 输出："fl"
     * 示例 2：
     *
     * 输入：strs = ["dog","racecar","car"]
     * 输出：""
     * 解释：输入不存在公共前缀。
     *
     *
     * 提示：
     *
     * 1 <= strs.length <= 200
     * 0 <= strs[i].length <= 200
     * strs[i] 仅由小写英文字母组成
     */
    public String longestCommonPrefix(String[] strs) {
        String common = strs[0];
        int minLength = common.length();
        for(int i=1;i<strs.length;i++){
            int index = findCommonPrefixIndex(common, strs[i]);
            minLength = index < minLength ? index : minLength;
        }
        return common.substring(0, minLength);
    }

    private int findCommonPrefixIndex(String common, String str) {
        int minLength = common.length() < str.length() ? common.length() : str.length();
        for(int i=0;i<minLength;i++){
            if (common.charAt(i) != str.charAt(i)){
                return i;
            }
        }
        return minLength;
    }
}
