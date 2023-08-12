/* You are given a 1-indexed integer array nums of length n.

An element nums[i] of nums is called special if i divides n, i.e. n % i == 0.

Return the sum of the squares of all special elements of nums. */

class Solution {
    public int sumOfSquares(int[] nums) {
        int sumOfSpecialSquares = 0;
        int n = nums.length;
        for(int i = 1 ; i <= n; i++) {
            if(n%i==0){
                sumOfSpecialSquares += nums[i-1]*nums[i-1];
            }
        }

        return sumOfSpecialSquares;
    }
}
