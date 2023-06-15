class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        if(nums.length <= 2) {
            return -1;
        }

        for(int j = 0; j < nums.length; j++) {
            if(nums[j] <= min) {
                min = nums[j];
            }
            
            if(nums[j] >= max) {
                max = nums[j];
            }
        }

        int selected_integer = -1;
        for(int i = 0 ; i < nums.length; i++) {
            if(nums[i] != min && nums[i] != max) {
                selected_integer = nums[i];
            }
        }

        return selected_integer;
    }
}

/*Given an integer array nums containing distinct positive integers, find and return any number from the array that is neither the minimum nor the maximum value in the array, or -1 if there is no such number.

Return the selected integer.*/

