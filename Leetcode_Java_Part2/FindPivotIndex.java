class Solution {
    public int pivotIndex(int[] nums) {
        int summation=0;
        int leftSummation=0;
        int rightSummation=0;
        int len = nums.length;
        int j = 0;
        for(j=0;j<len;j++) {
          summation = summation + nums[j];
        }
        for(j=0;j<len;j++) {
            if(j > 0) {
            leftSummation = leftSummation + nums[j-1];   
            }
            rightSummation=summation-nums[j]-leftSummation;
            if(rightSummation==leftSummation) {
                return j;
            }
        }
        return -1;
    }
}

/* Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1. */