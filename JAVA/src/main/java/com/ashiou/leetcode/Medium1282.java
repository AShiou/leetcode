/*
There are n people whose IDs go from 0 to n - 1 and each person belongs exactly to one group.
Given the array groupSizes of length n telling the group size each person belongs to,
return the groups there are and the people's IDs each group includes.

You can return any solution in any order and the same applies for IDs.
Also, it is guaranteed that there exists at least one solution.

Input: groupSizes = [3,3,3,3,3,1,3]
Output: [[5],[0,1,2],[3,4,6]]
Explanation:
Other possible solutions are [[2,1,6],[5],[0,4,3]] and [[5],[0,6,2],[4,3,1]].
 */
package com.ashiou.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Medium1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList();
        HashMap<Integer, List<Integer>> map = new HashMap();
        for (int i = 0; i < groupSizes.length; i++) {
            if (map.containsKey(groupSizes[i])) {
                List<Integer> list = map.get(groupSizes[i]);
                list.add(i);
            } else {
                List<Integer> list = new ArrayList();
                list.add(i);
                map.put(groupSizes[i], list);
            }
        }

        for (int key: map.keySet()) {
            List<Integer> list = map.get(key);
            for (int i = 0; i < list.size(); i = i + key) {
                res.add(list.subList(i, i + key));
            }
        }
        return res;
    }
}
