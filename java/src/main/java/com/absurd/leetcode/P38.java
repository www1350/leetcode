package com.absurd.leetcode;

/**
 * @author wangwenwei
 * @time 2017/12/18
 */
public class P38 {
    public static String countAndSay(int n) {
        if (n == 1) return "1";
        String tmp = countAndSay(n-1);
        char[] tt = new char[tmp.length()*2];
        char a = tmp.charAt(0);
        int k=0;
        int t = 1;
        for(int i=1;i<tmp.length();i++){
            if (a != tmp.charAt(i)){
                tt[k++] = (char) (t+'0');
                tt[k++] = a;
                t = 1;
                a = tmp.charAt(i);
            }else{
                t++;
            }
        }
        tt[k++] = (char) (t+'0');
        tt[k++] = a;
        return String.copyValueOf(tt,0,k);

    }
}
