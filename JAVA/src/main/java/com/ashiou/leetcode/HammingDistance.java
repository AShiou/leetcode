/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ashiou.leetcode;

/**
 *
 * @author AShiou
 * 461.Hamming Distance
 */
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
}