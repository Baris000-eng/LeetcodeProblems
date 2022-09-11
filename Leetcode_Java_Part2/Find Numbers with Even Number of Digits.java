class Solution {
    public int findNumbers(int[] nums) {
        int numsWithEvenNumberOfDigits = 0;
        for(int i = 0; i < nums.length; i++) {
            String s = String.valueOf(nums[i]);
            if(s.length() % 2 == 0) {
                numsWithEvenNumberOfDigits++;
            }
        }
        return numsWithEvenNumberOfDigits;
    }
}


   // Given an array nums of integers, return how many of them contain an even number of digits.


