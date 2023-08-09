package com.absurd.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> map = new HashMap();
        for (int i = 0;i<nums1.length;i++){
            map.put(nums1[i], false);
        }

        for (int i = 0;i<nums2.length;i++){
            if (!map.containsKey(nums2[i])){
                continue;
            }
            map.put(nums2[i], true);
        }
        List<Integer> list1 = new ArrayList<>();
        for (Map.Entry<Integer,Boolean> entry:map.entrySet()) {
            if (entry.getValue() != true){
                continue;
            }
            list1.add(entry.getKey());
        }
        int[] res = new int[list1.size()];
        for (int i = 0;i<res.length;i++){
            res[i] = list1.get(i);
        }
        return res;
    }
}
