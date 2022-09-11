class Solution {
    public int maximumDifference(int[] nums) {
        int diff = Integer.MIN_VALUE;
        if(nums.length == 0) { //for the no element case.
            return 0;
        }
        for(int i = 0 ; i < nums.length; i++) { 
            for(int j = i+1; j < nums.length; j++) {
                if(i<j && nums[i] < nums[j] && nums[j]-nums[i]>diff) {
                        diff = nums[j] - nums[i];
                } 
            }
        }
        
        boolean isDecreasing = true; //for the monotonically decreasing array case
        for(int w = 0 ; w <= nums.length-2; w++) {
            if(nums[w+1] > nums[w]) {
                isDecreasing = false;
            }
        }
        
        if(isDecreasing == true) {
            return -1;
        }
       
        return diff;
    }
    
    /*Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j] (i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].

Return the maximum difference. If no such i and j exists, return -1./*
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    



