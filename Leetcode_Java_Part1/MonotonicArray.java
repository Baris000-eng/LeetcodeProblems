class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean is_monotonically_decreasing = true;
        boolean is_monotonically_increasing = true;
        int len = nums.length, i = 0;
        for(i = 0 ; i < len; i++) {
            if(i+1 <= len-1) {
                if(nums[i+1]>nums[i]) {
                    is_monotonically_decreasing = false;
                } else if(nums[i+1] < nums[i]) {
                     is_monotonically_increasing = false;
                }
            }
        }
        
        boolean is_monotonic = is_monotonically_decreasing || is_monotonically_increasing;
        
        return is_monotonic;
        

        
    }
}

/*An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.*/





