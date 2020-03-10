package org.itstack.leetcode.brush;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int[] twoSum_0(int[] nums, int target){
        int[] idxs = new int[2];
        for(int i =0; i < nums.length; i++){
            for(int j = nums.length - 1; j > i; j--){
                if(nums[i] + nums[j] == target){
                    idxs[0] = i;
                    idxs[1] = j;
                }
            }
        }
        return idxs;
    }

    public static int[] twoSum_1(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static int[] towSum_2(int[] nums, int target) {
        int volume = 2048;              // 100000000000
        int bitMode = volume - 1;       // 011111111111
        int[] t = new int[volume];      // store idx + 1, in order to skip default 0
        for (int i = 0; i < nums.length; i++) {
            int c = (target - nums[i]) & bitMode;
            if (t[c] != 0) return new int[]{t[c] - 1, i};
            t[nums[i] & bitMode] = i + 1;
        }
        return new int[]{-1, -1};
    }

}