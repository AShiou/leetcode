/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ashiou.leetcode;

/**
 *
 * @author AShiou
 * 760.Find Anagram Mappings
 * Time Complexity: O(A*B)
 * Space Complexity: O(A)
 */
public class FindAnagramMappings{
    public static int[] anagramMappings(int[] A, int[] B) {
        int[] answer = new int[A.length];
        for (int i = 0; i<A.length; i++) {
            for(int j = 0; j<B.length; j++) {
                if( A[i] == B[j]) {
                    answer[i] = j;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};
        int[] answer = anagramMappings(A,B);

        for(int i=0; i<answer.length; i++) {
            System.out.println(answer[i]);
        }  
    }
}