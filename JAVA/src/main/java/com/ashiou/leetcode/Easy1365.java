/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.
2 <= nums.length <= 500
0 <= nums[i] <= 100
 */
package com.ashiou.leetcode;

public class Easy1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[101];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        for (int i = 1; i < 101; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] > 0 ? arr[nums[i] - 1] : 0;
        }
        return nums;
    }
}

