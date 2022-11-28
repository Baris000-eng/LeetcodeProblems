class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        int[]array = new int[2];
        int j = 0;
        for(int i = 0 ; i < list.size(); i++) {
            if(Collections.frequency(list, list.get(i)) == 1) {
                if(j <= 1) {
                    array[j] = list.get(i);
                    j++;
                }
            }
        }
        return array;
    }
}



/* Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

You must write an algorithm that runs in linear runtime complexity and uses only constant extra space. */

/* Passed 31 test cases out of 32. Need to be a bit optimized */
