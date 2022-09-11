class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
       int len = nums.length;
       if(len == 0) { 
           return -999; //returning a made-up value for empty array case
       }
       int productIncludingNegativesAndPositives = nums[0]*nums[1]*nums[len-1];
       int productIncludingOnlyPositives = nums[len-1]*nums[len-2]*nums[len-3];
       if(productIncludingNegativesAndPositives>=productIncludingOnlyPositives) {
           return productIncludingNegativesAndPositives;
       }
           return productIncludingOnlyPositives;
       }
}



/*Given an integer array nums, find three numbers whose product is maximum and return the maximum product.*/