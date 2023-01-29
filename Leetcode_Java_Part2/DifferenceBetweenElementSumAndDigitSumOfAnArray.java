class Solution {
    public int differenceOfSum(int[] nums) {
        int sum_of_integers = 0;
        int sum_of_digits = 0;
        int nums_len = nums.length, i = 0;
        for(i = 0 ; i < nums_len; i++) {
            sum_of_integers = sum_of_integers + nums[i];
            int digit_sum_of_element = getDigitSum(nums[i]);
            sum_of_digits = sum_of_digits + digit_sum_of_element;
        }

        int difference = sum_of_integers - sum_of_digits;
        if(difference < 0) {
            difference = -difference;
        }
        return difference;
    }



    public int getDigitSum(int k) {
        int digitSum = 0;
        while(k > 0) {
            int remainder = k % 10;
            digitSum = digitSum + remainder;
            k = k / 10;
        }
        return digitSum;
    }
}


//You are given a positive integer array nums.

//The element sum is the sum of all the elements in nums.
//The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
//Return the absolute difference between the element sum and digit sum of nums.

//Note that the absolute difference between two integers x and y is defined as |x - y|.

 
//Example 1:
//Input: nums = [1,15,6,3]
//Output: 9
//Explanation: 
//The element sum of nums is 1 + 15 + 6 + 3 = 25.
//The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
//The absolute difference between the element sum and digit sum is |25 - 16| = 9.


//Example 2:
//Input: nums = [1,2,3,4]
//Output: 0
//Explanation:
//The element sum of nums is 1 + 2 + 3 + 4 = 10.
//The digit sum of nums is 1 + 2 + 3 + 4 = 10.
//The absolute difference between the element sum and digit sum is |10 - 10| = 0.