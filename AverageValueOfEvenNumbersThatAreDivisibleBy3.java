class Solution {
    public int averageValue(int[] nums) {
        int sumValue = 0;
        int counter = 0;
        
        
        for(int i = 0 ; i < nums.length; i++) {
            
            if(nums[i]%2 == 0) {
                
                
                if(nums[i]%3 == 0) {
                    
                    sumValue = sumValue + nums[i];
                    counter = counter + 1;
                }
                
                
            }
            
            
            
            
            
        }
        
        if(counter == 0) {
            return 0;
        }
        
        
        return ((int) (sumValue / counter));
    }
}




/*Given an integer array nums of positive integers, return the average value of all even integers that are divisible by 3.

Note that the average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.*/