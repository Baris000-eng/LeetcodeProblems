class Solution {
    public int[] getConcatenation(int[] nums) {
        if(nums.length == 0) {
            return null;
        }
        
        int[] ans = new int[2*nums.length];

        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);

        return ans;
    }
}


