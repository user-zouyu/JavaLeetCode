package com.zouyu.leetcode.hot100.Q0031;

import com.zouyu.Common.R;
import com.zouyu.Common.T;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * @author ZouYu 2022/10/17 11:22
 * @version 1.0.0
 */
public class MainTest {

    private static Solution solution;

    @BeforeAll
    public static void init() {
        solution = new Solution();
    }

    @ParameterizedTest
    @MethodSource({"test"})
    public void test(R<int[], int[]> param) {

        solution.nextPermutation(param.getActual());

        Assertions.assertArrayEquals(param.getActual(), param.getExpected());
    }

    public static Stream<Arguments> test() {
        return Stream.of(
                R.test(T.of(1, 2, 3),   T.of(1, 3, 2)),
                R.test(T.of(3, 2, 1),   T.of(1, 2, 3)),
                R.test(T.of(1, 2),      T.of(2, 1)),
                R.test(T.of(2),         T.of(2)),
                R.test(T.of(1, 5, 1),   T.of(5, 1, 1)),
                R.error(T.of(1, 3, 2),  T.of(2, 1, 3))
        ).map(Arguments::of);
    }
}
