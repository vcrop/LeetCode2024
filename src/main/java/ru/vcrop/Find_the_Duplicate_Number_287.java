package ru.vcrop;

// https://leetcode.com/problems/find-the-duplicate-number/
// Runtime: 3 ms, faster than 89.42% of Java online submissions for Find the Duplicate Number.

public class Find_the_Duplicate_Number_287 {
    public int findDuplicate(int[] nums) {
        int offset = (1 << 20) - 1;
        for (int num : nums) {
            if ((nums[(num & offset) - 1] >>> 20) != 0) return num & offset;
            nums[(num & offset) - 1] += 1 << 20;
        }
        return -1;
    }

}
