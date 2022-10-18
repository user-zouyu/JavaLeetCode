package com.zouyu.Common;

/**
 * @author ZouYu 2022/10/17 22:45
 * @version 1.0.0
 */
public class E<F, S> {
    private final F f;
    private final S s;

    public E(F f, S s) {
        this.f = f;
        this.s = s;
    }

    public static <F, S> E<F, S> of(F ints, S num) {
        return new E<>(ints, num);
    }


    public F getF() {
        return f;
    }

    public S getS() {
        return s;
    }
}
