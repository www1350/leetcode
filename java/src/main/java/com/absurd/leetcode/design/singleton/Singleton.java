package com.absurd.leetcode.design.singleton;

/**
 * @author absurd
 * @version Singleton.java, v 0.1 2023年10月07日 17:34 absurd
 */
public class Singleton {
    private static Singleton uniqueInstance;
    private Singleton() {
    }

    /***
     * 线程不安全
     * @return
     */
    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    /***
     * 线程安全
     * @return
     */
    public synchronized static Singleton getSafeUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}