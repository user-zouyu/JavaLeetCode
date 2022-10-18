package com.zouyu.hot100.Q0039;


import com.zouyu.Common.E;
import com.zouyu.Common.R;
import com.zouyu.Common.T;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author ZouYu 2022/10/17 22:30
 * @version 1.0.0
 */
public class MainTest {

    private static final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource({"test"})
    public void test(R<E<int[], Integer>, Void> param) {
        List<List<Integer>> lists = solution.combinationSum(param.getActual().getF(), param.getActual().getS());
        lists.forEach(System.out::println);
    }

    public static Stream<Arguments> test() {
        return Stream.of(
                R.test(E.of(T.of(1, 2, 3), 3), null)
        ).map(Arguments::of);
    }

}
