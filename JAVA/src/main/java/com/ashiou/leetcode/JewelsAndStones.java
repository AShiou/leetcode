/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ashiou.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author AShiou
 * 771. Jewels and Stones
 * Time Complexity: O(S+J)
 * Space Complexity: O(J) 
 */
class JewelsAndStones {
    public static int numJewelsInStones(String J, String S) {
        int sum = 0;
        Set bucket = new HashSet();
        for(char jewel: J.toCharArray()) {
            bucket.add(jewel);
        }
        for(char stone: S.toCharArray()) {
            if(bucket.contains(stone)) {
                sum++;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }
}
