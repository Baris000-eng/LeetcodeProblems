class Solution {
    public int missingNumber(int[] nums) {
        int result = 0, sum = 0;
        for(int i = 0 ; i <= nums.length; i++) {
           sum = sum + i; 
           if(i <= nums.length-1) {
                  result = result + nums[i];
           }
        }
        return sum - result;
    }
}


//Given an array nums containing n distinct numbers in the range [0, n], return the only number in 
//the range that is missing from the array.