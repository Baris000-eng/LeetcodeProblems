/*You are given a 0-indexed integer array nums. You have to find the maximum sum 
of a pair of numbers from nums such that the maximum digit in both numbers are equal.
Return the maximum sum or -1 if no such pair exists.*/
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxSum(int[] nums) {
        Map<Integer, Integer> maxSumByMaxDigit = new HashMap<>();
        int maximumSum = -1;

        for (int num : nums) {
            int maxDigit = findMaxDigit(num);
            if (maxSumByMaxDigit.containsKey(maxDigit)) {
                int currentSum = maxSumByMaxDigit.get(maxDigit);
                maximumSum = Math.max(maximumSum, currentSum + num);
                maxSumByMaxDigit.put(maxDigit, Math.max(currentSum, num));
            } else {
                maxSumByMaxDigit.put(maxDigit, num);
            }
        }

        return maximumSum;
    }

    private int findMaxDigit(int num) {
        int maxDigit = 0;
        while (num > 0) {
            int digit = num % 10;
            maxDigit = Math.max(maxDigit, digit);
            num /= 10;
        }
        return maxDigit;
    }
}
