package com.bacazy.leetcode.p1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void testTwoSum() throws Exception {
        assertArrayEquals(new TwoSum().twoSum(new int[]{1,2,3,4}, 7),new int[]{2,3});
        assertArrayEquals(new TwoSum().twoSum(new int[]{10,2,3,4}, 12),new int[]{0,1});
        assertArrayEquals(new TwoSum().twoSum(new int[]{11,2,3,4}, 14),new int[]{0,2});
    }
}