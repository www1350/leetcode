package com.absurd.leetcode;

import java.util.Comparator;

/**
 * https://leetcode.com/problems/roman-to-integer/description/
 * Roman to Integer
 * @author wangwenwei
 * @time 2017/12/10
 */
public class P13 {
    /***
     * Given a roman numeral, convert it to an integer.

     Input is guaranteed to be within the range from 1 to 3999.
     基本字符
     I	V	X	L	C	D	M
     1	5	10	50	100	500	1000
     相同的数字连写、所表示的数等于这些数字相加得到的数、如：Ⅲ=3；
     小的数字在大的数字的右边、所表示的数等于这些数字相加得到的数、 如：Ⅷ=8、Ⅻ=12；
     小的数字（限于 I、X 和 C）在大的数字的左边、所表示的数等于大数减小数得到的数、如：Ⅳ=4、Ⅸ=9；
     正常使用时、连写的数字重复不得超过三次；
     在一个数的上面画一条横线、表示这个数扩大 1000 倍。
     有两条须注意掌握：
     基本数字 Ⅰ、X 、C 中的任何一个、自身连用构成数目、或者放在大数的右边连用构成数目、都不能超过三个；放在大数的左边只能用一个；
     不能把基本数字 V 、L 、D 中的任何一个作为小数放在大数的左边采用相减的方法构成数目；放在大数的右边采用相加的方式构成数目、只能使用一个；
     ·个位数举例
     Ⅰ－1、Ⅱ－2、Ⅲ－3、Ⅳ－4、Ⅴ－5、Ⅵ－6、Ⅶ－7、Ⅷ－8、Ⅸ－9
     ·十位数举例
     Ⅹ－10、Ⅺ－11、Ⅻ－12、XIII－13、XIV－14、XV－15、XVI－16、XVII－17、XVIII－18、XIX－19、XX－20、XXI－21、XXII－22、XXIX－29、XXX－30、XXXIV－34、XXXV－35、XXXIX－39、XL－40、L－50、LI－51、LV－55、LX－60、LXV－65、LXXX－80、XC－90、XCIII－93、XCV－95、XCVIII－98、XCIX－99
     ·百位数举例
     C－100、CC－200、CCC－300、CD－400、D－500、DC－600、DCC－700、DCCC－800、CM－900、CMXCIX－999
     ·千位数举例
     M－1000、MC－1100、MCD－1400、MD－1500、MDC－1600、MDCLXVI－1666、MDCCCLXXXVIII－1888、MDCCCXCIX－1899、MCM－1900、MCMLXXVI－1976、MCMLXXXIV－1984、MCMXC－1990、MM－2000、MMMCMXCIX－3999
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        int total = 0;
        for(int i=0;i<s.length()-1;i++){
            int now = getNumber(s.charAt(i));
            if (now>=getNumber(s.charAt(i+1))){
                total = total +now;
            }else{
                total = total -now;
            }
        }
        total += getNumber(s.charAt(s.length()-1));
        return total;

    }

    public static int getNumber(char a){
        int number = 0;
        switch (a){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                break;
        }
        return number;
    }
}
