package com.zouyu.offer.Q0001;

/**
 * @author ZouYu 2022/9/21 21:01
 * @version 1.0.0
 */
public class Solution {

    public int div(int dividend, int divisor) {
        // 考虑 (-2^31)/(-1) 会溢出
        if (dividend == 0x80000000 && divisor == -1) {
            return 0x7fffffff; // MAX VALUE
        }

        if (divisor == 1) {
            return dividend;
        }

        if (divisor == -1) {
            return -dividend;
        }
        int negative = 2;
        if (dividend > 0) {
            negative--;
            dividend = -dividend;
        }

        if (divisor > 0) {
            negative--;
            divisor = -divisor;
        }
        int result = divideCore(dividend, divisor);
        return negative == 1 ? -result: result;
    }

    private int divideCore(int dividend, int divisor) {
        int result = 0;
        while (dividend <= divisor) {
            int value = divisor;
            int quotient = 1;
            while (value >= 0xc0000000 && dividend <= value + value) {
                quotient += quotient;
                value += value;
            }
            dividend -= value;
            result += quotient;
        }
        return result;
    }



}
