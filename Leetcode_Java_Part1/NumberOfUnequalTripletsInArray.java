class Solution {
    public int unequalTriplets(int[] nums) {
        int unequalTripletNumber = 0;
        for(int i = 0 ; i < nums.length;  i++) {
            for(int j = i+1; j < nums.length; j++) {
                for(int k = j + 1 ;  k < nums.length; k++) {
                    if(
                        nums[i] != nums[j] && 
                        nums[j] != nums[k] &&
                        nums[i] != nums[k] &&
                        i >= 0 && 
                        i < j && 
                        j < k && 
                        k < nums.length
                    ) {
                        unequalTripletNumber++;
                    }
                }
            }
        }
        
        
        return unequalTripletNumber;
    }
}

/* You are given a 0-indexed array of positive integers nums. Find the number of triplets (i, j, k) that meet the following conditions:

0 <= i < j < k < nums.length
nums[i], nums[j], and nums[k] are pairwise distinct.
In other words, nums[i] != nums[j], nums[i] != nums[k], and nums[j] != nums[k].
Return the number of triplets that meet the conditions. */

