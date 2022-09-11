class Solution {
    public int countKDifference(int[] nums, int k) {
        int l = nums.length;
        int absoluteDiffCount = 0;
        for(int i = 0; i < l; i++) {
            for(int j = i + 1; j < l; j++) {
                int diff = nums[i] - nums[j];
                if(Math.abs(diff) == k) {
                     absoluteDiffCount++;
                }
            }
        }
        return absoluteDiffCount;
    }
}

//Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

//The value of |x| is defined as:

//x if x >= 0.
//-x if x < 0.