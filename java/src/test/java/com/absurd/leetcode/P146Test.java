package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wangwenwei
 * @time 2018/2/3
 */
public class P146Test {
    @Test
    public void cacheTest(){
        LRUCache cache = new LRUCache( 2 /* capacity */ );

        cache.put(1, 1);
        cache.put(2, 2);
        Assert.assertEquals(cache.get(1),1);       // returns 1
        cache.put(3, 3);    // evicts key 2
        Assert.assertEquals(cache.get(2),-1);       // returns -1 (not found)
        Assert.assertEquals(cache.get(3),3);       // returns 3.
        cache.put(4, 4);    // evicts key 1.
        Assert.assertEquals(cache.get(1),-1);       // returns -1 (not found)
        Assert.assertEquals(cache.get(3),3);       // returns 3
        Assert.assertEquals(cache.get(4),4);       // returns 4

    }

    @Test
    public void cacheForZeroTest(){
        LRUCache cache = new LRUCache( 0 /* capacity */ );
        cache.put(0,0);
        Assert.assertEquals(cache.get(0),-1);
    }

    @Test
    public void cacheForOneTest(){
        LRUCache cache = new LRUCache( 1 /* capacity */ );
        cache.put(2,1);
        Assert.assertEquals(cache.get(2),1);
        cache.put(3,2);
        Assert.assertEquals(cache.get(2),-1);
        Assert.assertEquals(cache.get(3),2);
    }

    @Test
    public void cacheForTwoTest(){
        LRUCache cache = new LRUCache( 2 /* capacity */ );
        cache.put(2,1);
        cache.put(2, 2);
        Assert.assertEquals(cache.get(2),2);
        cache.put(1, 1);
        cache.put(4, 1);
        Assert.assertEquals(cache.get(2),-1);
    }

    @Test
    public void cacheForMoreTest(){
        LRUCache cache = new LRUCache( 10 /* capacity */ );
        cache.put(10,13);
        cache.put(3, 17);
        cache.put(6, 11);
        cache.put(10, 5);
        cache.put(9, 10);
        Assert.assertEquals(cache.get(13),-1);
        cache.put(2,19);
        Assert.assertEquals(cache.get(2),19);
        Assert.assertEquals(cache.get(3),17);
        cache.put(5,25);
        Assert.assertEquals(cache.get(8),-1);
        cache.put(9,22);
        cache.put(5,5);
        cache.put(1,30);
        Assert.assertEquals(cache.get(11),-1);
        cache.put(9, 12);
        Assert.assertEquals(cache.get(7),-1);
        Assert.assertEquals(cache.get(5),5);
        Assert.assertEquals(cache.get(8),-1);
        Assert.assertEquals(cache.get(9),12);
        cache.put(4,30);
        cache.put(9, 3);
        Assert.assertEquals(cache.get(9),3);
        Assert.assertEquals(cache.get(10),5);
        Assert.assertEquals(cache.get(10),5);
        cache.put(6,14);
        cache.put(3, 1);
        Assert.assertEquals(cache.get(3),1);
        cache.put(10, 11);
        Assert.assertEquals(cache.get(8),-1);
        cache.put(2, 14);
        Assert.assertEquals(cache.get(1),30);
        Assert.assertEquals(cache.get(5),5);
        Assert.assertEquals(cache.get(4),30);
        cache.put(11,14);
        cache.put(12,24);
        cache.put(5,18);
        Assert.assertEquals(cache.get(13),-1);
        cache.put(7,23);
        Assert.assertEquals(cache.get(8),-1);
        Assert.assertEquals(cache.get(12),24);
        cache.put(3,27);
        cache.put(2,12);
        Assert.assertEquals(cache.get(5),18);
        cache.put(2,9);
        cache.put(13,4);
        cache.put(8,18);
        cache.put(1,7);
        Assert.assertEquals(cache.get(6),-1);
        cache.put(9,29);
        cache.put(8,21);
        Assert.assertEquals(cache.get(5),18);

        cache.put(6,30);
        cache.put(1,12);
        Assert.assertEquals(cache.get(10),-1);
        cache.put(4,15);cache.put(7,22);cache.put(11,26);cache.put(8,17);cache.put(9,29);
        Assert.assertEquals(cache.get(5),18);

        cache.put(3,4);
        cache.put(11,30);
        Assert.assertEquals(cache.get(12),-1);
        cache.put(4,29);
        Assert.assertEquals(cache.get(3),4);
        Assert.assertEquals(cache.get(9),29);
        Assert.assertEquals(cache.get(6),30);cache.put(3,4);
        Assert.assertEquals(cache.get(1),12);Assert.assertEquals(cache.get(10),-1);
        cache.put(3,29);cache.put(10,28);cache.put(1,20);cache.put(11,13);
        Assert.assertEquals(cache.get(3),29);
        cache.put(3,12);cache.put(3,8);cache.put(10,9);cache.put(3,26);
        Assert.assertEquals(cache.get(8),17);
        Assert.assertEquals(cache.get(7),22);
        Assert.assertEquals(cache.get(5),18);cache.put(13,17);cache.put(2,27);cache.put(11,15);
        Assert.assertEquals(cache.get(12),-1);
        cache.put(9,19);cache.put(2,15);cache.put(3,16);

        Assert.assertEquals(cache.get(1),20);
        cache.put(12,17);cache.put(9,1);
        cache.put(6,19);

        Assert.assertEquals(cache.get(4),-1);
        Assert.assertEquals(cache.get(5),18);Assert.assertEquals(cache.get(5),18);



        cache.put(8,1);cache.put(11,7);cache.put(5,2);cache.put(9,28);
        Assert.assertEquals(cache.get(1),20);
        cache.put(2,2);
        cache.put(7,4);cache.put(4,22);cache.put(7,24);cache.put(9,26);cache.put(13,28);cache.put(11,26);
    }

}
