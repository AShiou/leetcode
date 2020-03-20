/*
We are given a list nums of integers representing a list compressed with run-length encoding.

Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
For each such pair, there are freq elements with value val concatenated in a sublist.
Concatenate all the sublists from left to right to generate the decompressed list.

Return the decompressed list.

Input: nums = [1,1,2,3]
Output: [1,3,3]
 */
package com.ashiou.leetcode;

import java.util.ArrayList;

public class Easy1313 {
    public int[] decompressRLElist_3ms(int[] nums) {
        ArrayList arr = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i = i + 2) {
            for (int j = 0; j < nums[i]; j++) {
                arr.add(nums[i + 1]);
            }
        }
        int[] res = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = (int)arr.get(i);
        }
        return res;
    }

    public int[] decompressRLElist_1ms(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            size = size + nums[i];
        }
        int[] res = new int[size];
        int index = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            for (int j = 0; j < nums[i]; j++) {
                res[index] = nums[i + 1];
                index++;
            }
        }
        return res;
    }
}
