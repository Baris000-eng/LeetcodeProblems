class Solution {
    public int countQuadruplets(int[] nums) {
        int quadrupleCount = 0;
        for(int i = 0 ; i < nums.length; i++) {
            for(int j = i+1 ; j < nums.length; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    for(int t = k+1; t < nums.length; t++) {
                      if(nums[i]+nums[j]+nums[k] == nums[t] && i<j && j<k && k<t) {
                          quadrupleCount++;
                      }
                    }
                }
            }
        }
        
        
        return quadrupleCount;
    }
}


/*Given a 0-indexed integer array nums, return the number of distinct quadruplets (a, b, c, d) such that:

nums[a] + nums[b] + nums[c] == nums[d], and
a < b < c < d*/
