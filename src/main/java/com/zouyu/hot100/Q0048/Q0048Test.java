package com.zouyu.hot100.Q0048;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author ZouYu 2022/10/31 18:37
 * @version 1.0.0
 */
public class Q0048Test {

    private static final Solution solution = new Solution();

    @Test
    void test() {
        int[][] matrix = {{1}};
        print(matrix);
        System.out.println();

        solution.rotate(matrix);
        print(matrix);
    }

    @Test
    void test1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        print(matrix);
        System.out.println();
        solution.rotate(matrix);

        print(matrix);
    }

    @Test
    void test2() {
        int[][] matrix = {{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}, {4, 5, 6, 7}};

        print(matrix);
        System.out.println();
        solution.rotate(matrix);

        print(matrix);
    }



    private static void print(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
