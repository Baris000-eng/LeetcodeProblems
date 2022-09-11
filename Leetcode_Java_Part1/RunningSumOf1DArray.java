class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = {};
        if(nums.length == 0) {
            return arr;
        }
        int len = nums.length;
        arr = new int[len];
        int arrLen = arr.length, j = 0, runningSum = 0;
        for(j = 0; j < arrLen; j++){
            runningSum = runningSum + nums[j];
            arr[j] = runningSum;
        }
        
        return arr;
    }
}

/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums. */
