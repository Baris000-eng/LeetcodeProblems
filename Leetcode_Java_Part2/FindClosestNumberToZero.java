class Solution {
    public int findClosestNumber(int[] nums) {
        int min = nums[0];
        for(int i = 0 ; i < nums.length; i++) {
            if(Math.abs(nums[i]) < Math.abs(min)) {
                min = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1 ; j < nums.length; j++) {
                if(Math.abs(nums[i]) == Math.abs(nums[j]) && Math.abs(nums[i]) == Math.abs(min)
                  && nums[i]!=nums[j]) { // for dealing with same distance case
                   return (int) Math.max(nums[i],nums[j]);
                } 
            }
        }
        return min;
    }
}

/*Given an integer array nums of size n, return the number with the value closest to 0 in nums. If there are multiple answers, return the number with the largest value.*/