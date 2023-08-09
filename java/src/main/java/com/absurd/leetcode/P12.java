package com.absurd.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * P12
 *
 * @author Absurd
 * @version 2023/08/10 00:10
 **/
public class P12 {
    static Map<Integer,String> ROMAN_INDEX = new LinkedHashMap<>();

    static {
        ROMAN_INDEX.put(1000, "M");
        ROMAN_INDEX.put(900, "CM");
        ROMAN_INDEX.put(500, "D");
        ROMAN_INDEX.put(400, "CD");
        ROMAN_INDEX.put(100, "C");
        ROMAN_INDEX.put(90, "XC");
        ROMAN_INDEX.put(50, "L");
        ROMAN_INDEX.put(40, "XL");
        ROMAN_INDEX.put(10, "X");
        ROMAN_INDEX.put(9, "IX");
        ROMAN_INDEX.put(5, "V");
        ROMAN_INDEX.put(4, "IV");
        ROMAN_INDEX.put(1, "I");
    }

    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Integer, String> entry:ROMAN_INDEX.entrySet()) {
            while (entry.getKey()<=num){
                num-=entry.getKey();
                stringBuilder.append(entry.getValue());
            }

        }
        return stringBuilder.toString();


    }
}
