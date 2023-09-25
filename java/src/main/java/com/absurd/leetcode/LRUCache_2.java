package com.absurd.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author absurd
 * @version LRUCache_2.java, v 0.1 2023年09月25日 13:33 absurd
 */
public class LRUCache_2 {

    private int capacity;

    private Map<Integer,Integer> map;


    public LRUCache_2(int initialCapacity, int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<Integer,Integer>(initialCapacity, 0.75f, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value){
        map.put(key, value);
    }

}