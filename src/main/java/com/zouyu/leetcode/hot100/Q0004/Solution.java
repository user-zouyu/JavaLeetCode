package com.zouyu.leetcode.hot100.Q0004;

/**
 * @author ZouYu 2022/8/20 23:41
 * @version 1.0.0
 */
class Solution {

//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//
//        int sum = nums1.length + nums2.length;
//        int index = (sum + 1) / 2;
//        int i = 0;
//        int j = 0;
//
//        while (i < nums1.length && j < nums2.length && i + j + 1 < index) {
//            if (nums1[i] < nums2[j]) {
//                i++;
//            } else {
//                j++;
//            }
//        }
//
//        while (i < nums1.length && i + j + 1 < index) i++;
//        while (j < nums2.length && i + j + 1 < index) j++;
//
//        int min1 = Math.min(i < nums1.length ? nums1[i] : Integer.MAX_VALUE,
//                            j + 1 < nums2.length ? nums2[j + 1] : Integer.MAX_VALUE);
//        int min2 = Math.min(j < nums2.length ? nums2[j] : Integer.MAX_VALUE,
//                i + 1 < nums1.length ? nums1[i + 1] : Integer.MAX_VALUE);
//        if(sum % 2 == 1) {
//            return Math.min(min1, min2);
//        } else {
//            return (double)(min1 + min2) / 2;
//        }
//    }

//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//
//        if(nums1.length > nums2.length) {
//            return findMedianSortedArrays(nums2, nums1);
//        }
//        int targetIndex = nums2.length + (nums1.length - nums2.length + 1) / 2;
//        int left = 0;
//        int right = nums1.length;
//
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if(nums1[mid] < nums2[targetIndex - mid - 1]) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//
//        int nums1Index = left;
//        int nums2Index = targetIndex - left - 1;
//
//        int min1 = Math.min(nums1Index < nums1.length ? nums1[nums1Index] : Integer.MAX_VALUE,
//                nums2Index + 1 < nums2.length ? nums2[nums2Index + 1] : Integer.MAX_VALUE);
//        int min2 = Math.min(nums2Index < nums2.length ? nums2[nums2Index] : Integer.MAX_VALUE,
//                nums1Index + 1 < nums1.length ? nums1[nums1Index + 1] : Integer.MAX_VALUE);
//        if((nums1.length + nums2.length) % 2 == 1) {
//            return Math.min(min1, min2);
//        } else {
//            return (double)(min1 + min2) / 2;
//        }
//    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int m = nums1.length;
        int n = nums2.length;

        // 分割线左边的所有元素需要满足的个数 m + (n - m + 1) / 2;
        int totalLeft = (m + n + 1) / 2;

        // 在 nums1 的区间 [0, m) 里查找恰当的分割线，
        // 使得 nums1[i - 1] <= nums2[j] && nums2[j - 1] <= nums1[i]
        int left = 0;
        int right = m;

        while (left < right) {
            int i = left + (right - left) / 2;
            int j = totalLeft - i;
            if (nums2[j - 1] > nums1[i]) {
                // 下一轮搜索的区间 [i + 1, right]
                left = i + 1;
            } else {
                // 下一轮搜索的区间 [left, i]
                right = i;
            }
        }

        int i = left;
        int j = totalLeft - i;
        int nums1LeftMax = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
        int nums1RightMin = i == m ? Integer.MAX_VALUE : nums1[i];
        int nums2LeftMax = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
        int nums2RightMin = j == n ? Integer.MAX_VALUE : nums2[j];

        if (((m + n) % 2) == 1) {
            return Math.max(nums1LeftMax, nums2LeftMax);
        } else {
            return (double) ((Math.max(nums1LeftMax, nums2LeftMax) + Math.min(nums1RightMin, nums2RightMin))) / 2;
        }
    }

//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//
//        new
//
//
//        return 0;
//    }
}
