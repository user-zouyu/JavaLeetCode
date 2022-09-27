package com.zouyu.hot100.Q0022;

import java.util.*;

/**
 * @author ZouYu 2022/9/27 18:30
 * @version 1.0.0
 */
class Solution {
    public List<String> generateParenthesis(int n) {
        return new ArrayList<>(generate(n));
    }

    private static final Map<Integer, Set<String>> map = new HashMap<>();

    private Set<String> generate(int n) {

        if (n == 1) {
            map.put(1, new HashSet<String>() {{add("()");}});
            return map.get(1);
        }

        Set<String> res = new HashSet<>();
        for (int i = 1; i < n; i++) {

            if(!map.containsKey(i)) {
                Set<String> generate = generate(i);
                map.put(i, generate);
            }

            if (!map.containsKey(n - i)) {
                Set<String> generate = generate(n - i);
                map.put(n - i, generate);
            }

            for (String prev: map.get(i)) {
                for (String last: map.get(n - i)) {
                    res.add(prev + last);
                }
            }
        }

        for (String middle : map.get(n - 1)) {
            res.add("(" + middle + ")");
        }

        return res;
    }
}