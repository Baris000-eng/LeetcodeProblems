import java.math.BigInteger;
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> lst = new ArrayList<Boolean>();
        int num = 0, len = nums.length, j = 0;
        for(j = 0; j < len; j++) {
            num = (num * 2 + nums[i]) % 5;
            if(num != 0) {
                lst.add(false);
            } else {
                lst.add(true);
            }
        }
        return list;
    }
        
        
}

/*You are given a binary array nums (0-indexed).

We define xi as the number whose binary representation is the subarray nums[0..i] (from most-significant-bit to least-significant-bit).

For example, if nums = [1,0,1], then x0 = 1, x1 = 2, and x2 = 5.
Return an array of booleans answer where answer[i] is true if xi is divisible by 5.*/



