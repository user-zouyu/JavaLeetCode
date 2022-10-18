package com.zouyu.Common;

/**
 * @author ZouYu 2022/10/17 13:38
 * @version 1.0.0
 */
public class T {
    public static <T> T[] of(T[] arr) {
        return arr;
    }

    public static int[] of(int ...ints) {
        return ints;
    }

    public static long[] of(long ...longs) {
        return longs;
    }

    public static float[] of(float ...floats) {
        return floats;
    }

    public static double[] of(double ...doubles) {
        return doubles;
    }

    public byte[] of(byte ...bytes) {
        return bytes;
    }

    public boolean[] of(boolean ...booleans) {
        return booleans;
    }

    @SafeVarargs
    public static <Type> Type[] from(Type ...types) {
        return types;
    }


}
