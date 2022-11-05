package com.zouyu.leetcode.hot100.Q0034;

import com.zouyu.Common.R;
import com.zouyu.Common.T;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author ZouYu 2022/10/17 21:52
 * @version 1.0.0
 */
public class MainTest {

    public static class Entry {
        int[] ints;
        int num;

        public Entry(int[] ints, int num) {
            this.ints = ints;
            this.num = num;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "ints=" + Arrays.toString(ints) +
                    ", num=" + num +
                    '}';
        }

        public static Entry of(int[] ints, int num) {
            return new Entry(ints, num);
        }
    }

    private static final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource({"test"})
    public void test(R<Entry, int[]> param) {
        int[] ints = solution.searchRange(param.getActual().ints, param.getActual().num);
        System.out.println(param.getActual());
        System.out.println(Arrays.toString(ints));
        Assertions.assertArrayEquals(param.getExpected(), ints);
    }

    public static Stream<Arguments> test() {
        return Stream.of(
                R.test(Entry.of(T.of(5, 7, 7, 8, 8, 10), 8), T.of(3, 4)),
                R.test(Entry.of(T.of(5, 7, 7, 8, 8, 10), 6), T.of(-1, -1)),
                R.test(Entry.of(T.of(new int[0]), 8), T.of(-1, -1)),
                R.test(Entry.of(T.of(5, 7, 7, 8, 8, 10), 5), T.of(0, 0)),
                R.test(Entry.of(T.of(5, 7, 7, 8, 8, 9, 10), 9), T.of(5, 5)),
                R.test(Entry.of(T.of(5, 7, 7, 8, 8, 10), 10), T.of(5, 5)),
                R.error(Entry.of(T.of(1, 1, 2), 1), T.of(0, 1))
        ).map(Arguments::of);
    }

}
