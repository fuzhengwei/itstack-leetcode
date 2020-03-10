package org.itstack.leetcode.brush.test;

import com.alibaba.fastjson.JSON;
import org.itstack.leetcode.brush.Solution;
import org.junit.Test;

public class ApiTest {

    private int[] nums = {2, 7, 11, 15};

    @Test
    public void test_twoSum_0(){
        int[] ints = Solution.twoSum_0(nums, 9);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }

    @Test
    public void test_twoSum_1(){
        int[] ints = Solution.twoSum_1(nums, 9);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }

    @Test
    public void test_towSum_2(){
        int[] ints = Solution.towSum_2(nums, 9);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }

    @Test
    public void test_idx() {

        int volume = 20;                // 100000000000
        int bitMode = volume - 1;       // 011111111111
        int[] t = new int[volume];      // store index+1, in order to skip default 0

        int[] nums = {-3, 4, 3, 9, 10, -2, 6};

        for (int i = 0; i < nums.length; i++) {
            int idx = bitMode & nums[i];
            int val = i + 1;
            t[idx] = i + 1;
            System.out.println("值："+nums[i] + " 位置：" + idx + " 结果："+val);
        }

        System.out.println(JSON.toJSONString(t));

    }

}
