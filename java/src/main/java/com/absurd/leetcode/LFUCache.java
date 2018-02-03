package com.absurd.leetcode;

import java.util.*;

/**
 * Least Frequently Used (LFU) is a type of cache algorithm used to manage memory within a computer.
 * The standard characteristics of this method involve the system keeping track of the number of times a block is referenced in memory.
 * When the cache is full and requires more room the system will purge the item with the lowest reference frequency.
 * @author wangwenwei
 * @time 2018/2/3
 */
public class LFUCache {
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

    /***
     * <freq,linklist>
     */
    private Map<Integer,LinkNode<Integer>> freqNodeMaps;


    private int minFreq;


    public LFUCache(int capacity) {
        this.capacity = capacity;
        currentCap = 0;
        kvMaps = new HashMap<>();
        kNodeMaps = new HashMap<>();
        freqNodeMaps = new HashMap<>();
        minFreq = 0;

    }

    public int get(int key) {
        Integer value = kvMaps.get(key);
        if (value ==null) return -1;
        Node<Integer> node = kNodeMaps.get(key);
        LinkNode<Integer> linkNode = node.listNode;
        int oldFre = node.getFreq();
        if (linkNode.head == linkNode.tail){
            freqNodeMaps.remove(oldFre);
            if (oldFre == minFreq){
                minFreq++;
            }
        }
        linkNode.remove(node);

        node.incFreq();
        LinkNode<Integer> newLinkNode = freqNodeMaps.get(oldFre+1);
        if (newLinkNode == null){
            newLinkNode = new LinkNode<>(node);
            freqNodeMaps.put(oldFre+1,newLinkNode);
        }else{
            newLinkNode.add(node);
        }
        node.listNode = newLinkNode;
        return value;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;
        Integer oldValue = kvMaps.get(key);
        kvMaps.put(key,value);
        //不为空，去掉旧的(error)
        //不对，不为空虽然是去掉旧的，但是其实频率会保留
        if (oldValue != null){
//            Node<Integer> e =  kNodeMaps.get(key);
//            if (e.listNode.head == e.listNode.tail){
//                freqNodeMaps.remove(e.freq);
//            }
//            e.listNode.remove(e);
//            kNodeMaps.remove(e.value);
//            kvMaps.remove(key);
//            currentCap--;
            get(key);
            return;
        }


        LinkNode<Integer> linkNode =  freqNodeMaps.get(0);
        Node<Integer> newNode = new Node<>(key);
        kNodeMaps.put(key,newNode);
        if (linkNode == null){
            linkNode = new LinkNode<>(newNode);
            freqNodeMaps.put(0,linkNode);
        }else{
            linkNode.add(newNode);
        }
        newNode.listNode = linkNode;
        currentCap++;

        if (currentCap > capacity){
            Node<Integer> node = freqNodeMaps.get(minFreq).tail;
            kvMaps.remove(node.value);
            kNodeMaps.remove(node.value);
            LinkNode<Integer> eLinkNode = node.listNode;
            if (eLinkNode.head == eLinkNode.tail){
                freqNodeMaps.remove(node.getFreq());
            }
            eLinkNode.remove(node);
            currentCap--;
        }
        minFreq = 0;
    }

    class LinkNode<T>{
        private Node<T> head;
        private Node<T> tail;

        public LinkNode() {
        }
        public LinkNode(Node<T> node) {
            this.head = node;
            this.tail = node;
        }


        public void add(Node<T> node){
            Node<T> e = this.head;
            node.next = e;
            e.pre = node;
            this.head = node;
        }

        public void remove(Node<T> node){
            if(head == tail){
                head = tail = null;
            }else if (head == node){
                node.next.pre = null;
                head = node.next;
                node.next = null;
            }else if(tail == node){
                node.pre.next = null;
                tail = node.pre;
                node.pre = null;
            }else{
                node.pre.next = node.next;
                node.next.pre = node.pre;
                node.pre = null;
                node.next = null;
            }
            node.listNode = null;

        }
    }

    class Node<T>{
        private T value;
        private int freq;
        private Node<T> next;
        private Node<T> pre;
        private LinkNode<T> listNode;

        public Node(T value) {
            this.value = value;
            this.freq = 0;
        }

        public int getFreq() {
            return freq;
        }

        public void incFreq(){
            freq++;
        }
    }
}

