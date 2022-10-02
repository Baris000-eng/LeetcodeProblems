class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> lst = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < nums.length; i++) {
            list.add(nums[i]);
            if((!(lst.contains(nums[i])) && Collections.frequency(list,nums[i])==2)) {
                lst.add(nums[i]);
            }
        }
        Collections.sort(lst);
        return lst;
    }
}

/* Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space. */
