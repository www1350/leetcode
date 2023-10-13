package com.absurd.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/lru-cache/description/
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
 *
 * Follow up:
 * Could you do both operations in O(1) time complexity?
 * @author wangwenwei
 * @time 2018/2/3
 */
public class LRUCache_3 {

    private int capacity;
    private int currentCap;

    /***
     * <k,v>
     *
     */
    private Map<Integer,Node<Integer,Integer>> cache;

    private Node<Integer,Integer> head;

    private Node<Integer,Integer> tail;


    public LRUCache_3(int capacity) {
        this.capacity = capacity;
        this.currentCap = 0;
        cache = new HashMap<>();
    }

    public int get(int key) {
        Node<Integer,Integer> node = cache.get(key);
        if (node == null) return -1;
        remove(node);
        addTail(node);

        return node.value;

    }

    /***
     * 1->2->3
     *
     *
     * @param node
     */
    private void addTail(Node<Integer, Integer> node) {
        if (tail != null) {
            tail.next = node;
            node.pre = tail;
        }
        if (head == null){
            head = node;
        }
        tail = node;
    }

    /***
     * 1->2->3  1->3
     *
     * 1->2->3  2->3  1->2
     *
     * 1
     *
     * @param node
     */
    private void remove(Node<Integer,Integer> node) {
        Node pre = node.pre;
        Node next = node.next;
        if (pre != null) {
            pre.next = next;
        } else {
            head = head.next;
        }
        if (next != null) {
            next.pre = pre;
        }else {
            tail = tail.pre;
        }
        node.pre = null;
        node.next = null;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;
        Node<Integer,Integer> oldNode = cache.get(key);
        if (oldNode != null){
            remove(oldNode);
            currentCap--;
        }
        Node<Integer,Integer> newNode = new Node<>(key, value);
        cache.put(key,newNode);
        addTail(newNode);
        currentCap++;
        if (currentCap > capacity){
            cache.remove(head.key);
            remove(head);
            currentCap--;
        }

    }


    public class Node<K,V>{
        private K key;
        private V value;
        private Node<K,V> next;
        private Node<K,V> pre;

        public Node(K key,V value) {
            this.key = key;
            this.value = value;
        }
    }
}
