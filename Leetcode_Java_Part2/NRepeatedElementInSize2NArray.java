class Solution {
    public int repeatedNTimes(int[] nums) {
        int len = nums.length;
        boolean[]myArray = new boolean[len];
        Arrays.fill(myArray,false);
        for(int i = 0 ; i < len; i++) {
            int count = 1;
            if(myArray[i] == true) {
                continue;
            }
            for(int j = i + 1 ; j < len; j++) {
                if(nums[j] == nums[i]) {
                    count++;
                    myArray[j] = true;
                }
            }
            if(count == nums.length/2) {
                return nums[i];
            }
        }
        
        return 0;
    }
}


/* You are given an integer array nums with the following properties:

nums.length == 2 * n.
nums contains n + 1 unique elements.
Exactly one element of nums is repeated n times.
Return the element that is repeated n times. */

