package com.absurd.leetcode.design.singleton;

/**
 * @author absurd
 * @version DCSingleton.java, v 0.1 2023年10月07日 17:36 absurd
 */
public class DCSingleton {
    /***
     * mesi，防止缓存和重排
     */
    private volatile static DCSingleton uniqueInstance;
    private DCSingleton() {}
    public static DCSingleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (DCSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DCSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}