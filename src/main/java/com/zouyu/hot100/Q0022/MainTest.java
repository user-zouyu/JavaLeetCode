package com.zouyu.hot100.Q0022;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author ZouYu 2022/9/27 18:36
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
        List<String> strings = solution.generateParenthesis(3);
        strings.forEach(System.out::println);
    }

    @Test
    void test_2() {
        List<String> strings = solution.generateParenthesis(4);
        List<String> list = Arrays.asList("(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()",
                "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()");

        Assertions.assertEquals(list.size(), strings.size());
        strings.stream().sorted().forEach(System.out::println);
    }

}

//()()()()
//(()())()
//(()(()))
//()()(())
//(((())))
//(())()()
//()((()))
//()(())()
//()(()())
//(()()())
//((()()))
//((()))()
//((())())

//"(((())))", Y
//"((()()))", Y
//"((())())",
//"((()))()",
// "(()(()))",
// "(()()())",
// "(()())()",
// "(())(())",
// "(())()()",
// "()((()))",
// "()(()())",
// ()(())()",
// "()()(())",
// "()()()()"

