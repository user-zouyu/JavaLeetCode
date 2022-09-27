package com.zouyu.hot100.Q0017;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author ZouYu 2022/9/27 14:01
 * @version 1.0.0
 */
public class MainTest {

    private static Solution solution;

    @BeforeAll
    public static void init() {
        solution = new Solution();
    }

    @Test
    void test_1() {
        String digits = "23";
        List<String> strings = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");

        List<String> result = solution.letterCombinations(digits);

        Assertions.assertEquals(strings.size(), result.size());
        Assertions.assertTrue(result.containsAll(strings));
    }


    @Test
    void error1() {
        String digits = "5678";
        List<String> strings = Arrays.asList("jmpt","jmpu","jmpv","jmqt","jmqu","jmqv","jmrt","jmru","jmrv",
                "jmst","jmsu","jmsv","jnpt","jnpu","jnpv","jnqt","jnqu","jnqv","jnrt","jnru","jnrv","jnst",
                "jnsu","jnsv","jopt","jopu","jopv","joqt","joqu","joqv","jort","joru","jorv","jost","josu",
                "josv","kmpt","kmpu","kmpv","kmqt","kmqu","kmqv","kmrt","kmru","kmrv","kmst","kmsu","kmsv",
                "knpt","knpu","knpv","knqt","knqu","knqv","knrt","knru","knrv","knst","knsu","knsv","kopt",
                "kopu","kopv","koqt","koqu","koqv","kort","koru","korv","kost","kosu","kosv","lmpt","lmpu",
                "lmpv","lmqt","lmqu","lmqv","lmrt","lmru","lmrv","lmst","lmsu","lmsv","lnpt","lnpu","lnpv",
                "lnqt","lnqu","lnqv","lnrt","lnru","lnrv","lnst","lnsu","lnsv","lopt","lopu",
                "lopv","loqt","loqu","loqv","lort","loru","lorv","lost","losu","losv");

        List<String> result = solution.letterCombinations(digits);

        Assertions.assertEquals(strings.size(), result.size());
        Assertions.assertTrue(result.containsAll(strings));
    }
}
