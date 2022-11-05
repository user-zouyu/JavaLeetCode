package com.zouyu.leetcode.hot100.Q0049;

import java.util.*;

/**
 * @author ZouYu 2022/10/31 19:04
 * @version 1.0.0
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length <= 1) {
            return Collections.singletonList(Arrays.asList(strs));
        }

        ArrayList<String> strings = new ArrayList<>(strs.length);
        for (String str : strs) {
            byte[] bytes = str.getBytes();
            Arrays.sort(bytes);
            strings.add(new String(bytes));
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            Integer index = hashMap.get(strings.get(i));
            if (index != null) {
                res.get(index).add(strs[i]);
            } else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                res.add(temp);
                hashMap.put(strings.get(i), res.size() - 1);
            }
        }

        return res;
    }
}
