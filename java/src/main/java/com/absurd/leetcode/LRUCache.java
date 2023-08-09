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
public class LRUCache {

    private int capacity;
    private int currentCap;

    /***
     * <k,v>
     *
     */
    private Map<Integer,Integer> kvMaps;

    /***
     * <k,Node>
     */
    private Map<Integer,Node<Integer>> kNodeMaps;

    private Queue<Integer> queue;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.currentCap = 0;
        kvMaps = new HashMap<>();
        kNodeMaps = new HashMap<>();
        queue = new Queue<>();
    }

    public int get(int key) {
        Integer value = kvMaps.get(key);
        if (value == null) return -1;
        Node<Integer> old = kNodeMaps.get(key);
        queue.remove(old);
        Node<Integer> newNode = new Node<Integer>(key);
        queue.add(newNode);
        kNodeMaps.put(key,newNode);
        return value;

    }

    public void put(int key, int value) {
        if (capacity == 0) return;
        Integer oldValue = kvMaps.get(key);
        if (oldValue != null){
            Node<Integer> old = kNodeMaps.get(key);
            queue.remove(old);
            kNodeMaps.remove(key);
            currentCap--;
        }
        kvMaps.put(key,value);
        Node<Integer> newNode = new Node<Integer>(key);
        queue.add(newNode);
        kNodeMaps.put(key,newNode);
        currentCap++;
        if (currentCap > capacity){
            Node<Integer> oldNode =  queue.peak();
            kvMaps.remove(oldNode.value);
            kNodeMaps.remove(oldNode.value);
            currentCap--;
        }

    }

    class Queue<T>{
        private Node<T> head;
        private Node<T> tail;

        public Queue() {
        }

        public Queue(Node<T> node) {
            this.head = node;
            this.tail = node;
        }


        /***
         * 尾插法
         * @param node
         */
        public void add(Node<T> node){
            if (this.head == null && this.tail == null){
                this.head = this.tail = node;
            }
            Node<T> e = this.tail;
            e.next = node;
            node.pre = e;
            this.tail = node;
        }

        public void remove(Node<T> node){
            if (this.head == node && this.tail == node){
                this.head = this.tail = null;
            }else if(this.tail == node){
                Node<T> e = node.pre;
                e.next = null;
                node.pre = null;
                this.tail = e;
            }else  if(this.head == node){
                Node<T> e = node.next;
                e.pre = null;
                node.next = null;
                this.head = e;
            }else{
                Node<T> next = node.next;
                Node<T> pre = node.pre;
                next.pre = pre;
                pre.next = next;
                node.next = null;
                node.pre = null;
            }
        }

        /***
         * 队列头的出来
         * @return
         */
        public Node<T> peak(){
            Node<T> e =  this.head;
            Node<T> nextE = e.next;
            e.next = null;
            this.head = nextE;
            if (nextE !=null){
                nextE.pre = null;
            }else{
                this.tail = null;
            }
            return e;
        }
    }

    public class Node<T>{
        private T value;
        private Node<T> next;
        private Node<T> pre;

        public Node(T value) {
            this.value = value;
        }
    }
}
