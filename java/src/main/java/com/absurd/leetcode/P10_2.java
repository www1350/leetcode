package com.absurd.leetcode;

/**
 * https://leetcode.com/problems/regular-expression-matching/description/
 * @author wangwenwei
 * @time 2017/12/9
 */
public class P10_2 {
    /***
     *
     * Implement regular expression matching with support for '.' and '*'.

     '.' Matches any single character.
     '*' Matches zero or more of the preceding element.

     The matching should cover the entire input string (not partial).

     The function prototype should be:
     bool isMatch(const char *s, const char *p)

     Some examples:
     isMatch("aa","a") → false
     isMatch("aa","aa") → true
     isMatch("aaa","aa") → false
     isMatch("aa", "a*") → true
     isMatch("aa", ".*") → true
     isMatch("ab", ".*") → true
     isMatch("aab", "c*a*b") → true

     * @param s
     * @param p
     * @return
     */
    public static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean dp[][] = new boolean[m+1][n+1];
        dp[0][0] = true;
        for (int i = 1; i <= m; i++)
            dp[i][0] = false;
        for (int j = 1; j <= n; j++)
            dp[0][j] = j > 1 && '*' == p.charAt(j-1) && dp[0][j - 2];

        for(int i=1 ; i <= m; i++ ){
            for (int j = 1; j <= n; j++){
                if (p.charAt(j-1) == '*'){
                    dp[i][j] = dp[i][j-2] || (s.charAt(i-1) == p.charAt(j-2) || '.' ==p.charAt(j-2)) && dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j-1] && (s.charAt(i-1) == p.charAt(j-1) || '.' == p.charAt(j-1));
                }
            }
        }

        return dp[m][n];

    }
}
