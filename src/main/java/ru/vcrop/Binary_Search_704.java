package ru.vcrop;

//https://leetcode.com/problems/binary-search/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.

public class Binary_Search_704 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int middle = (right - left) / 2 + left;
            if (nums[middle] < target) left = middle + 1;
            else right = middle;
        }
        return nums[left] == target ? left : -1;
    }

}
