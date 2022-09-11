class Solution {
    //Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
    //The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
    public int findGCD(int[] nums) {
        int max = nums[0], min = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]>=max) {
                max = nums[i];
            } else if(nums[i] <= min) {
                min = nums[i];
            }
        }
        
        
        return gcd(min,max);
        
    }
    
    public int gcd(int a, int b) {
        int max_divisor = 1;
            for(int i = 1; i<=a; i++) {
                if(a%i==0 && b%i==0) {
                      if (i>max_divisor) {
                           max_divisor=i;
                      }
                }
            } 
        return max_divisor;
    }
    
   
}