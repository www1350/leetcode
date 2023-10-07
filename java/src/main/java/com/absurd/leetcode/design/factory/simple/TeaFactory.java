package com.absurd.leetcode.design.factory.simple;

import com.absurd.leetcode.design.factory.*;

/**
 * @author absurd
 * @version TeaFactory.java, v 0.1 2023年10月07日 16:16 absurd
 */
public class TeaFactory {
    public static Tea createTea(TeaCategoryEnum categoryEnum){
        switch (categoryEnum){
            case RED:
                return new RedTea();
            case GREEN:
                return new GreenTea();
            default:
                return new DefaultTea();
        }
    }
}