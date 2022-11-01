package com.zouyu.hot100.Q0049;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author ZouYu 2022/10/31 19:15
 * @version 1.0.0
 */
public class Q0049Test {

    private static final Solution solution = new Solution();

    @Test
    void test() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = solution.groupAnagrams(strs);
        System.out.println(lists);
    }

    @Test
    void test1() {
        String[] strs = {"a"};
        List<List<String>> lists = solution.groupAnagrams(strs);
        System.out.println(lists);
    }

}
