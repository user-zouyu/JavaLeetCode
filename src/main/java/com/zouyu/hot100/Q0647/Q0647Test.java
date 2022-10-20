package com.zouyu.hot100.Q0647;

import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/10/20 11:50
 * @version 1.0.0
 */
public class Q0647Test {

    private static final Solution solution = new Solution1();


    @Test
    public void test() {
        int abccba = solution.countSubstrings("dnncbwoneinoplypwgbwktmvkoimcooyiwirgbxlcttgteqthcvyoueyftiwgwwxvxvg");
        System.out.println(abccba);
    }

    @Test
    public void test2() {
        int substrings = solution.countSubstrings("abccba");
        System.out.println(substrings);

    }

    @Test
    public void test3() {
        int substrings = solution.countSubstrings("wgww");
        System.out.println(substrings);

    }



}
