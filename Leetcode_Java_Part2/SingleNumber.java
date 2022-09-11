class Solution {
    public int singleNumber(int[] nums) { //My second solution
    int result =0, len=nums.length,j=0;
    for(j=0; j<len; j++){
        result = result^nums[j];
    }
    return result;
   }
    
    public int singleNumber(int[] nums) { //My first solution
        for(int i = 0 ; i < nums.length; i++) {
            int count = 1;
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j] && i!=j) {
                    count++;
                } 
            }
            if(count == 1) {
                return nums[i];
            }
        }
        return 0;
    }
}

/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.*/
 


