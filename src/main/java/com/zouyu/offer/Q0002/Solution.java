package com.zouyu.offer.Q0002;

/**
 * @author ZouYu 2022/9/21 21:52
 * @version 1.0.0
 */
public class Solution {

    public String addBinary(String left, String right) {
        StringBuilder result = new StringBuilder();
        int i = left.length() - 1;
        int j = right.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int l = i >= 0 ? left.charAt(i) - '0': 0;
            int r = j >= 0 ? right.charAt(j) - '0': 0;
            int sum = l + r + carry;
            carry = sum >= 2 ? 1 : 0;
            result.append(sum >= 2 ? sum - 2 : sum);
            i--;
            j--;
        }
        if(carry == 1) {
            result.append(carry);
        }
        return result.reverse().toString();
    }

}
