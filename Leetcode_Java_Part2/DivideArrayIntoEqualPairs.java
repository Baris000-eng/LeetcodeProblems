class Solution {
    public boolean divideArray(int[] nums) {
        boolean[]arr = new boolean[nums.length];
        boolean has_even_count = true;
        Arrays.fill(arr,false);
        for(int i = 0 ; i < nums.length; i++) {
            int count = 1;
            if(arr[i] == true) {
                continue;
            }
         for(int j = i+1 ; j < nums.length; j++) {
             if(nums[i]==nums[j]) {
                 count++;
                 arr[j] = true;
             }
         }
            if(count % 2 != 0) {
                has_even_count = false;
            }
        }
        
        return has_even_count;
    }
}

/*You are given an integer array nums consisting of 2 * n integers.

You need to divide nums into n pairs such that:

Each element belongs to exactly one pair.
The elements present in a pair are equal.
Return true if nums can be divided into n pairs, otherwise return false.*/



