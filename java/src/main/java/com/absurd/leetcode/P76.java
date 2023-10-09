package com.absurd.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 最小覆盖子串
 * @author absurd
 * @version P76.java, v 0.1 2023年10月09日 11:26 absurd
 */
public class P76 {

    /***
     * 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
     *
     *
     *
     * 注意：
     *
     * 对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。
     * 如果 s 中存在这样的子串，我们保证它是唯一的答案。
     *
     *
     * 示例 1：
     *
     * 输入：s = "ADOBECODEBANC", t = "ABC"
     * 输出："BANC"
     * 解释：最小覆盖子串 "BANC" 包含来自字符串 t 的 'A'、'B' 和 'C'。
     * 示例 2：
     *
     * 输入：s = "a", t = "a"
     * 输出："a"
     * 解释：整个字符串 s 是最小覆盖子串。
     * 示例 3:
     *
     * 输入: s = "a", t = "aa"
     * 输出: ""
     * 解释: t 中两个字符 'a' 均应包含在 s 的子串中，
     * 因此没有符合条件的子字符串，返回空字符串。
     *
     *
     * 提示：
     *
     * m == s.length
     * n == t.length
     * 1 <= m, n <= 105
     * s 和 t 由英文字母组成
     *
     */
    public String minWindow(String s, String t) {
        // 字符和个数
        Map<Character,Integer> needsMap = new HashMap<>();
        Map<Character,Integer> windowsMap = new HashMap<>();
        // 初始化
        for(int i=0;i<t.length();i++){
            needsMap.put(t.charAt(i), needsMap.getOrDefault(t.charAt(i),0) +1 );
        }
        int right=0;
        int minLength = Integer.MAX_VALUE;
        int minLeft = -1;
        int minRight = -1;
        for(int left=0;left<s.length();left++){
            // 缩小窗口
            if (left != 0 && windowsMap.containsKey(s.charAt(left-1))) {
                windowsMap.put(s.charAt(left-1),windowsMap.get(s.charAt(left-1))-1);
            }
            // 窗口往右滑动
            while ( right<s.length() && !check(windowsMap, needsMap)){
                if (needsMap.containsKey(s.charAt(right))) {
                    windowsMap.put(s.charAt(right), windowsMap.getOrDefault(s.charAt(right), 0) + 1);
                }
                right++;
            }
            if (check(windowsMap, needsMap)){
                if (right - left < minLength){
                    minLength = right - left;
                    minLeft = left;
                    minRight = right;
                }
            }
        }
        return minLength <= s.length() ? s.substring(minLeft,minRight) :"";

    }

    private boolean check(Map<Character, Integer> mainMap, Map<Character, Integer> subMap) {
        if (mainMap.size() != subMap.size()){
            return false;
        }
        for(Character key: subMap.keySet()){
            Integer mainV = mainMap.get(key);
            if(mainV == null || mainV < subMap.get(key)){
                return false;
            }
        }
        return true;
    }

}