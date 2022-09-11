import java.util.*;

class Solution {
    public int smallestEqual(int[] nums) {
        int len = nums.length;
        int smallestIndex = len-1;
        boolean satisfies = false;
        List<Integer>indexes = new ArrayList<Integer>();
        int i = 0;
        for(i = 0 ; i < len; i++) {
            if(i%10 == nums[i]) {
                satisfies = true;
                indexes.add(i);
            } 
        }
        
        if(satisfies == false) {
            return -1;
        } 
        
        return Collections.min(indexes);
    }
}


/*Given a 0-indexed integer array nums, return the smallest index i of nums such that i mod 10 == nums[i], or -1 if such index does not exist.

x mod y denotes the remainder when x is divided by y.*/


