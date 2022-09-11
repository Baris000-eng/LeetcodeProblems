class Solution {
    public int countPairs(int[] nums, int k) {
        int pairCount = 0;
        for(int i = 0 ; i < nums.length; i++) {
           for(int j = i+1; j < nums.length; j++) {
               if(0<= i && i < j && j < nums.length && nums[i]==nums[j]
                 && (i*j)%k==0) {
                   pairCount++;
               }
           }
        }
        return pairCount;
    }
}


//Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) where 0 <= i < j 
//////< n, such that nums[i] == nums[j] and (i * j) is divisible by k.