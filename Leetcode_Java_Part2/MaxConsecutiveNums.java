class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int oneCount = 0;
        int maxOneCount = 0;
        for(int j = 0 ; j < nums.length; j++) {
           if(nums[j] == 1) {
               oneCount++;
           } else {
               oneCount = 0;
           }
           if(oneCount >= maxOneCount) {
               maxOneCount = oneCount;
           }
       }
        
        return maxOneCount;
    }
}

/* Given a binary array nums, return the maximum number of consecutive 1's in the array. */
