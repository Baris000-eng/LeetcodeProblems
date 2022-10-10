class Solution {
    public int numOfPairs(String[] nums, String target) {
        int pairNum = 0;
        for(int i = 0 ; i < nums.length; i++) {
            for(int j = 0 ; j < nums.length; j++) {
                if(i!=j && (nums[i].concat(nums[j])).contentEquals(target)){
                    pairNum++;
                }
            }
        }
        return pairNum;
    }
}

/* Given an array of digit strings nums and a digit string target, return the number of pairs of indices (i, j) (where i != j) such that the concatenation of nums[i] + nums[j] equals target. */

