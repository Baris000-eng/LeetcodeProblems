class Solution {
    public int[] sortEvenOdd(int[] nums) {
        for(int i = 0 ; i < nums.length; i++) {
            for(int j = 0 ; j < nums.length; j++) {
                if((i%2 == 1 && j%2 == 1 && j > i && nums[j] > nums[i])
                    || (i%2 == 0 && j%2 == 0 && j > i && nums[i] > nums[j])){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                } 
            }
        }
        return nums;
    }
}



//You are given a 0-indexed integer array nums. Rearrange the values of nums according to the 
//following rules:

//Sort the values at odd indices of nums in non-increasing order.
//For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1] after. The values at odd 
//indices 1 and 3 are sorted in non-increasing order.
//Sort the values at even indices of nums in non-decreasing order.
//For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3] after. The values at even 
//indices 0 and 2 are sorted in non-decreasing order.
//Return the array formed after rearranging the values of nums.


