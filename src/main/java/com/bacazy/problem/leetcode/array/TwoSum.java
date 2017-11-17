package com.bacazy.problem.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target. <br>

 You may assume that each input would have exactly one solution, and you may not use the same element twice.<br>

 Example:<br>
 Given nums = [2, 7, 11, 15], target = 9,<br>

 Because nums[0] + nums[1] = 2 + 7 = 9,<br>
 return [0, 1].
 */
public class TwoSum {
    /**
     * 将以访问过的数据放入哈希表中，这样可以提高查找效率，时间复杂度提高到O(1)
     * @param nums 整数数组
     * @param target 目标值
     * @return 数组中和为目标值的两个数的索引
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];
            if (map.containsKey(c)){
                return new int[]{map.get(c), i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
