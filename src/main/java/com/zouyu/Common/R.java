package com.zouyu.Common;

import com.zouyu.hot100.Q0031.MainTest;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author ZouYu 2022/10/17 13:15
 * @version 1.0.0
 */
public class R<Actual, Expected> {
    private String title;
    private final Actual actual;
    private final Expected expected;

    public R(Actual actual, Expected expected) {
        this.actual = actual;
        this.expected = expected;
    }

    public R(String title, Actual actual, Expected expected) {
        this.title = title;
        this.actual = actual;
        this.expected = expected;
    }

    public static <Actual, Expected> R<Actual, Expected> test(Actual actual, Expected expected) {
        return new R<>("test", actual, expected);
    }

    public static <Actual, Expected> R<Actual, Expected> error(Actual actual, Expected expected) {
        return new R<>("error", actual, expected);
    }

    public static <Actual, Expected> R<Actual, Expected> error(String title, Actual actual, Expected expected) {
        return new R<>(title, actual, expected);
    }

    public Actual getActual() {
        return actual;
    }

    public Expected getExpected() {
        return expected;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append(title).append(": ");
        if (actual.getClass().isArray()) {
            Class<?> clazz = actual.getClass();
            if (clazz == byte[].class)
                buf.append(Arrays.toString((byte[]) actual));
            else if (clazz == short[].class)
                buf.append(Arrays.toString((short[]) actual));
            else if (clazz == int[].class)
                buf.append(Arrays.toString((int[]) actual));
            else if (clazz == long[].class)
                buf.append(Arrays.toString((long[]) actual));
            else if (clazz == char[].class)
                buf.append(Arrays.toString((char[]) actual));
            else if (clazz == float[].class)
                buf.append(Arrays.toString((float[]) actual));
            else if (clazz == double[].class)
                buf.append(Arrays.toString((double[]) actual));
            else if (clazz == boolean[].class)
                buf.append(Arrays.toString((boolean[]) actual));
            else
                buf.append(Arrays.toString((Object[]) actual));
        } else {
            buf.append(actual);
        }

        return buf.toString();
    }
}