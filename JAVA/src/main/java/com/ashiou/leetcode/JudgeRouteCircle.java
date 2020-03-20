/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ashiou.leetcode;

/**
 *
 * @author AShiou
 * 657. Judge Route Circle
 */
public class JudgeRouteCircle {
    public static boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for(char move: moves.toCharArray()) {
            switch(move) {
                case 'R': x++; break;
                case 'L': x--; break;
                case 'U': y++; break;
                case 'D': y--;
            }
        }
        return x==0 && y==0;
    }
    
    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
    }
}
