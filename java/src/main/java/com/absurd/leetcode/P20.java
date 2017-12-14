package com.absurd.leetcode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/description/
 * @author wangwenwei
 * @time 2017/12/11
 */
public class P20 {
    /***
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

     The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        int size = s.length();
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<size;i++){
            if ('(' == s.charAt(i) || '{' == s.charAt(i) ||'[' == s.charAt(i)){
                stack.push(s.charAt(i));
            }else{
                if (stack.isEmpty()) return false;
                char c = stack.pop().charValue();
                switch (s.charAt(i)){
                    case ')':
                        if ('(' != c){
                            return false;
                        }
                        break;
                    case '}':
                        if ('{' != c){
                            return false;
                        }
                        break;
                    case ']':
                        if ('[' != c){
                            return false;
                        }
                        break;
                    default:
                        return  false;
                }
            }
        }
        if (stack.isEmpty()) return true;
        return false;

    }
}
