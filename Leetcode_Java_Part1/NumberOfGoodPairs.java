class Solution {
    public int numIdenticalPairs(int[] nums) {
        int identicalPairCount = 0;
        for(int i = 0; i<nums.length; i++) {
            for(int j = i+1; j<nums.length; j++) {
                if(i<j && nums[i]==nums[j]) {
                    identicalPairCount++;
                }
            }
        }
        return identicalPairCount;
    }
}



    //Given an array of integers nums, return the number of good pairs.
    //A pair (i, j) is called good if nums[i] == nums[j] and i < j.