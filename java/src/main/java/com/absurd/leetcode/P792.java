package com.absurd.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * P792
 *
 * @author Absurd
 * @version 2023/08/10 23:31
 **/
public class P792 {

    private Map<String,Boolean> cache = new HashMap<>();

    /***
     * 给定字符串 s 和字符串数组 words, 返回  words[i] 中是s的子序列的单词个数 。
     *
     * 字符串的 子序列 是从原始字符串中生成的新字符串，可以从中删去一些字符(可以是none)，而不改变其余字符的相对顺序。
     *
     * 例如， “ace” 是 “abcde” 的子序列。
     *
     *
     * 示例 1:
     *
     * 输入: s = "abcde", words = ["a","bb","acd","ace"]
     * 输出: 3
     * 解释: 有三个是 s 的子序列的单词: "a", "acd", "ace"。
     * Example 2:
     *
     * 输入: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
     * 输出: 2
     *
     *
     * 提示:
     *
     * 1 <= s.length <= 5 * 104
     * 1 <= words.length <= 5000
     * 1 <= words[i].length <= 50
     * words[i]和 s 都只由小写字母组成。
     * @param s
     * @param words
     * @return
     */
    public int numMatchingSubseq(String s, String[] words) {
        int result = 0;

        for(int i=0;i<words.length;i++){
            boolean isMatch = hitCache(s,words[i]);
            if(isMatch){
                result++;
            }
        }
        return result;
    }


    private Boolean hitCache(String str, String sub){
        if(cache.containsKey(sub)){
            return cache.get(sub);
        }else {
            boolean result = numMatching(str, sub);
            cache.put(sub, result);
            return result;
        }
    }

    private boolean numMatching(String str, String sub){
        if(sub.length()>str.length()){
            return false;
        }
        int subIndex = 0;
        int strIndex = 0;
        int same = 0;
        while(strIndex<str.length() && subIndex<sub.length()){
            char subChar = sub.charAt(subIndex);
            if(subChar == str.charAt(strIndex)){
                subIndex++;strIndex++;
                same++;
            }else{
                if(sub.length()-same>str.length()-strIndex ){
                    return false;
                }
                strIndex++;
            }
        }
        return same == sub.length();
    }
}
