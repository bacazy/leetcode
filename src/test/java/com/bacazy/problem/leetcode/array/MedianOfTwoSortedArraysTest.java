package com.bacazy.problem.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MedianOfTwoSortedArraysTest {

    @Test
    public void testFindMedianSortedArrays() throws Exception {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3};
        assertEquals(new MedianOfTwoSortedArrays().findMedianSortedArrays(nums1,nums2),2,0.001);
    }
}