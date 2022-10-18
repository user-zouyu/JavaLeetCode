package com.zouyu.hot100.Q0046;

import com.zouyu.Common.T;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author ZouYu 2022/10/18 12:34
 * @version 1.0.0
 */
public class MainTest {

    private static final Solution solution = new Solution();

    @Test
    public void test() {
        int[] ints = T.of(1, 2, 3);
        List<List<Integer>> permute = solution.permute(ints);

        permute.forEach(System.out::println);
    }

}
