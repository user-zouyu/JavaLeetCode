package com.zouyu.hot100.Q0015;

import com.sun.javafx.collections.SortableList;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ZouYu 2022/8/30 20:11
 * @version 1.0.0
 */
class Solution {
    /*public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Map<Integer, Integer> map = new HashMap<>();
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                if (map.containsKey(nums[i])) {
                    map.put(nums[i], map.get(nums[i]) + 1);
                } else {
                    map.put(nums[i], 1);
                }
            } else {
                break;
            }
        }

        int zeroNum = 0;

        for (; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroNum++;
            } else {
                break;
            }
        }

        Set<List<Integer>> result = new HashSet<>();

        if (zeroNum >= 3) {
            result.add(Arrays.asList(0, 0, 0));
        }

        for (int j = i; j < nums.length; j++) {
            if (zeroNum > 0 && map.containsKey(-nums[j])) {
                result.add(Arrays.asList(-nums[j], 0, nums[j]));
            }

            for (Integer num : map.keySet()) {
                int sub = -num - nums[j];

                Integer count = map.get(sub);

                if (sub == num && count >= 2) {
                    result.add(Arrays.asList(num, num, nums[j]));
                } else if (sub != num && count != null) {
                    result.add(Arrays.asList(Math.min(sub, num), Math.max(sub, num), nums[j]));
                }
            }
        }

        for (int j = i; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                Integer count = map.get(-nums[j] - nums[k]);
                if (count != null) {
                    result.add(Arrays.asList(-nums[j] - nums[k], Math.min(nums[j], nums[k]), Math.max(nums[j], nums[k])));
                }
            }
        }

        return new ArrayList<>(result);
    }*/

    /*public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i < nums.length - 1;) {
            if (nums[i] < 0) {
                while (i + 1 < nums.length && nums[i] == nums[i +1]) {
                    i++;
                }
            } else if (nums[i - 1] != 0 && nums[i] == 0 && nums[i + 1] == 0) {
                i++;
            }

            int left = i - 1;
            int right = i + 1;

            while (left >=0 && right < nums.length) {
                int ans = nums[left] + nums[i] + nums[right];

                if(ans < 0) {
                    do {
                        right++;
                    } while (right < nums.length && nums[right - 1] == nums[right]);
                } else if (ans > 0) {
                    do {
                        left--;
                    } while (left >= 0 && nums[left + 1] == nums[left]);
                } else {
                    result.add(Arrays.asList(nums[left], nums[i], nums[right]));

                    do {
                        right++;
                    } while (right < nums.length && nums[right - 1] == nums[right]);

                    do {
                        left--;
                    } while (left >= 0 && nums[left + 1] == nums[left]);

                }
            }

            do {
                i++;
            } while (i < nums.length && nums[i - 1] == nums[i]);
        }
        return result;
    }*/

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                break;
            }

            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    do {
                        left++;
                    } while (left < right && nums[left - 1] == nums[left]);

                    do {
                        right--;
                    } while (left < right && nums[right + 1] == nums[right]);
                }
            }
        }

        return result;
    }
}
