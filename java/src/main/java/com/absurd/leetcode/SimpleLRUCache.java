package com.absurd.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author wangwenwei
 * @time 2018/8/20
 */
public class SimpleLRUCache<K, V> extends LinkedHashMap<K, V>{
    private static final int MAX_NODE_NUM = 100;

    private int limit;

    private Object lock = new Object();


    public SimpleLRUCache(int limit) {
        super(limit, 0.75f, true);
        this.limit = limit;
    }

    public SimpleLRUCache() {
        this(MAX_NODE_NUM);
    }

    /**
     * 判断节点数是否超限
     * @param eldest
     * @return 超限返回 true，否则返回 false
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > limit;
    }

    public V getValue(K key){
        synchronized (lock){
            return get(key);
        }
    }

    public void putValue(K key, V value){
        synchronized (lock){
            put(key, value);
        }
    }

    public boolean removeValue(K key){
        synchronized (lock){
            return remove(key) != null;
        }
    }

    public boolean removeAll(){
        clear();
        return true;
    }
}
