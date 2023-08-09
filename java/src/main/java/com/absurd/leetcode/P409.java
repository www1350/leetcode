package com.absurd.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个包含大写字母和小写字母的字符串 s ，返回 通过这些字母构造成的 最长的回文串 。
 *
 * 在构造过程中，请注意 区分大小写 。比如 "Aa" 不能当做一个回文字符串。
 *
 *  
 *
 * 示例 1:
 *
 * 输入:s = "abccccdd"
 * 输出:7
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 * 示例 2:
 *
 * 输入:s = "a"
 * 输入:1
 *  
 *
 * 提示:
 *
 * 1 <= s.length <= 2000
 * s 只由小写 和/或 大写英文字母组成
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/longest-palindrome
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P409 {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Integer count = map.getOrDefault(s.charAt(i), 0);
            count++;
            map.put(s.charAt(i), count);
        }
        int odd = 0;
        int even = 0;
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue()%2 ==0){
                even+= entry.getValue();
            }else {
                odd++;
            }
        }
        return s.length() - (odd >0?odd-1:0 );

    }
}
