package com.absurd.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
 *
 * 异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: s = "cbaebabacd", p = "abc"
 * 输出: [0,6]
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
 *  示例 2:
 *
 * 输入: s = "abab", p = "ab"
 * 输出: [0,1,2]
 * 解释:
 * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的异位词。
 * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的异位词。
 * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的异位词。
 *  
 *
 * 提示:
 *
 * 1 <= s.length, p.length <= 3 * 104
 * s 和 p 仅包含小写字母
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/find-all-anagrams-in-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(p.length()> s.length()){
            return res;
        }
        // 统计个数
        Map<Character,Integer> setP = new HashMap<>();
        for(int i=0;i<p.length();i++){
            setP.put(p.charAt(i), setP.getOrDefault(p.charAt(i),0)+1);
        }

        Map<Character,Integer> setS = new HashMap<>();
        for(int i=0;i<p.length();i++){
            setS.put(s.charAt(i),setS.getOrDefault(s.charAt(i), 0)+1);
        }

        // s = "cbaebabacd", p = "abc"
        //
        for(int start=0; start+p.length()<=s.length(); start++){
            if (setS.equals(setP)){
                res.add(start);
            }
            if (start+p.length() == s.length()){
                break;
            }
            char before = s.charAt(start);
            char after = s.charAt(start+p.length());
            if (setS.get(before) == 1){
                setS.remove(before);
            }else {
                setS.put(before, setS.get(before)-1);
            }

            setS.put(after,setS.getOrDefault(after, 0)+1);


        }
        return res;
    }
}
