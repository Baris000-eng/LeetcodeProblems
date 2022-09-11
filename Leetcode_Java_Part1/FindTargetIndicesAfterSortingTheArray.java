class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer>targets = new ArrayList<Integer>();
        int len = nums.length, i = 0;
        Arrays.sort(nums);
        boolean targetExists = false;
        for(i=0;i<len;i++) {
            if(nums[i] == target) {
                targetExists = true;
                targets.add(i);
            } 
        }
        if(targetExists == false) { 
           return Collections.<Integer>emptyList();
        }
        Collections.sort(targets);
        return targets;
    }
}

/*You are given a 0-indexed integer array nums and a target element target.

A target index is an index i such that nums[i] == target.

Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.*/
