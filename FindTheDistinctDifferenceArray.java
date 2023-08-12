/*You are given a 0-indexed array nums of length n.

The distinct difference array of nums is an array diff of length n such that diff[i] is equal 
to the number of distinct elements in the suffix nums[i + 1, ..., n - 1] subtracted from the 
number of distinct elements in the prefix nums[0, ..., i].

Return the distinct difference array of nums.

Note that nums[i, ..., j] denotes the subarray of nums starting at index i and ending 
at index j inclusive. Particularly, if i > j then nums[i, ..., j] denotes an empty subarray.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] distinctDiffArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int[]prefixArray = Arrays.copyOfRange(nums, 0, i+1);
            int[]suffixArray = Arrays.copyOfRange(nums, i+1, nums.length);
            distinctDiffArr[i] = findDistinctElementNum(prefixArray) - findDistinctElementNum(suffixArray);
        }
        return distinctDiffArr;
    }

    public int findDistinctElementNum(int[] numbersArr) {
        HashSet<Integer> distinctNums = new HashSet<Integer>();
        for (int number : numbersArr) {
                distinctNums.add(number);
        }
        return distinctNums.size();
    }
}
