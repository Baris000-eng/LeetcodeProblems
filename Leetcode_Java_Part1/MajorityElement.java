class Solution {
    public int majorityElement(int[] nums) {
         Arrays.sort(nums);
         int l = nums.length;
         return nums[l/2];
    }
}
      

///Initial Array = [3,3,3,3,3,3,2,2,2,1]
///Sorted Array = [1,2,2,2,3,3,3,3,3,3]
///nums.length/2 = 4
///nums[4] = 3

//Given an array nums of size n, return the majority element.

//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
        