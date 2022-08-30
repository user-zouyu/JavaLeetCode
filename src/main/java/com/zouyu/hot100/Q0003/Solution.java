package com.zouyu.hot100.Q0003;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ZouYu 2022/8/20 22:56
 * @version 1.0.0
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;

        while (right < s.length()) {
            for (int i = left; i < right; i++) {
                if(s.charAt(i) == s.charAt(right)) {
                    left = i + 1;
                    break;
                }
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }

//    public int lengthOfLongestSubstring(String s) {
//        int left = 0;
//        int right = 0;
//        int max = 0;
//
//        Set<Character> charSet = new HashSet<>();
//
//        while (right < s.length()) {
//            Character charAt = s.charAt(right);
//            if (charSet.contains(charAt)) {
//                while (charSet.contains(charAt)) {
//                    charSet.remove(s.charAt(left));
//                    left++;
//                }
//            }
//            charSet.add(charAt);
//            max = Math.max(max, charSet.size());
//            right++;
//        }
//        return max;
//    }
}
