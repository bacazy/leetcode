package com.bacazy.problem.leetcode.array;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively. <br>
 * <p>
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)). <br>
 * Example 1:  <br>
 * nums1 = [1, 3] <br>
 * nums2 = [2] <br>
 * The median is 2.0 <br>
 * Example 2: <br>
 * nums1 = [1, 2]  <br>
 * nums2 = [3, 4] <br>t
 * the median is (2 + 3)/2 = 2.5
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int M = nums1.length;
        int N = nums2.length;
        int upperCount = 0;
        int lowerCount = 0;
        int lo1 = 0;
        int lo2 = 0;
        int hi1 = M - 1;
        int hi2 = N - 1;
        int halfCount = M + (N - M) / 2;
        while (lowerCount <= halfCount && upperCount <= halfCount) {
            int mid1 = lo1 + (hi1 - lo1) / 2;
            int mid2 = lo2 + (hi2 - lo2) / 2;
            if (nums1[mid1] > nums2[mid2]){
                upperCount += hi1 - mid1;
                lowerCount += mid2 - lo2;
                lo2= mid2;
                hi1 = mid1;
            }else {
                upperCount += hi2 - mid2;
                lowerCount += mid1 - lo1;
                hi2= mid2;
                lo1 = mid1;
            }
        }

        return 0;
    }
}
