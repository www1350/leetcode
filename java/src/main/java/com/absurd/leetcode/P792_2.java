package com.absurd.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * P792
 *
 * @author Absurd
 * @version 2023/08/10 23:31
 **/
public class P792_2 {



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
        dealDeque(words);
        int result = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int size = deques[c-'a'].size();
            if (size == 0){
                continue;
            }
            for(int x=0;x<size;x++){
                String e = deques[c-'a'].pollFirst();
                if (e.length() == 1){
                    result++;
                }else {
                    deques[e.charAt(1) - 'a'].add(e.substring(1));
                }
            }

        }
        return result;
    }

    /**
     * a->'ab','ab'
     * c->'c','cd'
     */
    private Deque<String>[] deques = new Deque[26];

    private void dealDeque(String[] words) {
        for(int i=0;i<deques.length;i++){
            deques[i] = new ArrayDeque<>();
        }
        for(String word:words){
            deques[word.charAt(0)-'a'].add(word);
        }
    }


}
