package com.zouyu.leetcode.everyday.Q0670;

/**
 * @author ZouYu 2022/9/14 23:02
 * @version 1.0.0
 */
class Solution {
    public int maximumSwap(int num) {

        int temp = num % 10;
        int j = 1;
        int k = 1;
        for (int i = num / 10; i > 0; i = i / 10) {
            int g = i % 10;
            j = j * 10;
            if(g >= temp) {
               temp = g;
               k = j;
           }
        }
        if(j == k) {
            return num;
        }
        int max = (num / k) % 10;
        int first = num / j;

        return num + (max - first) * j - (max - first) * k;
    }
}
