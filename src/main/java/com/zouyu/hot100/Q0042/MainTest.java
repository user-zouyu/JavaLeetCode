package com.zouyu.hot100.Q0042;

import com.zouyu.Common.R;
import com.zouyu.Common.T;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * @author ZouYu 2022/10/18 11:04
 * @version 1.0.0
 */
public class MainTest {

    private static final Solution solution = new SolutionStack();


    @ParameterizedTest
    @MethodSource({"test"})
    public void test(R<int[], Integer> param) {
        int trap = solution.trap(param.getActual());

        Assertions.assertEquals(trap, param.getExpected());
    }

    public static Stream<Arguments> test() {
        return Stream.of(
                R.test(T.of(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1), 6),
                R.test(T.of(4, 2, 0, 3, 2, 5), 9)
        ).map(Arguments::of);
    }

}
