class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0], index = 0;
        boolean zeroExists = true;
        List<Double>ratios = new ArrayList<Double>();
        for(int i = 0 ; i < nums.length; i++) {
            if(nums[i] >= max) {
                index = i;
                max = nums[i];
            }
        }
        
        for(int j = 0 ; j < nums.length; j++) {
            if(nums[j]!=0 && nums[j]!=max) {
                zeroExists = false;
                ratios.add(1.0 * max /nums[j]);
            }
        }
        if(zeroExists == true||Collections.min(ratios) >= 2) {
            return index;
        } 
            return -1;
    }
}


/*You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.*/




