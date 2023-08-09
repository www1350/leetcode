package com.absurd.leetcode;

public class P557 {
    public String reverseWords(String s) {
        String[] list = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i =0;i<list.length;i++){
            String rt = reverse(list[i]);
            if (i == 0) {
                result.append(rt);
            }else {
                result.append(" "+rt);
            }
        }
        return result.toString();
    }

    private String reverse(String s) {
        char[] x = s.toCharArray();
        for(int i =0;i<s.length()/2;i++){
            char tmp = x[i];
            x[i] = x[s.length() - i-1];
            x[s.length() - i -1] = tmp;
        }
        return new String(x);
    }

    public static void main(String[] args) {
        String a = "1";
        a.concat("2");
        System.out.println(a);
    }
}
