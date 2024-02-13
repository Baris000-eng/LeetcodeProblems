/* You are given a binary string s that contains at least one '1'.

You have to rearrange the bits in such a way that the resulting binary number is the maximum odd binary number that can be created from this combination.

Return a string representing the maximum odd binary number that can be created from the given combination.

Note that the resulting string can have leading zeros.

 

Example 1:

Input: s = "010"
Output: "001"
Explanation: Because there is just one '1', it must be in the last position. So the answer is "001".

Example 2:

Input: s = "0101"
Output: "1001"
Explanation: One of the '1's must be in the last position. The maximum number that can be made with the remaining digits is "100". 
So the answer is "1001". */

class Solution {
    public String maximumOddBinaryNumber(String s) {
        String maxOddBinaryNum = "";
        int length = s.length();
        int oneCount = 0;
        for(int i = 0 ; i < length; i++) {
            if(s.charAt(i) == '1') {
                oneCount++;
            }
        }

        int zeroCount = length - oneCount;
        if(oneCount > 1) {
            for(int i = 0; i < oneCount - 1; i++) {
                maxOddBinaryNum += "1";
            }
        }

        for(int j = 0 ; j < zeroCount; j++) {
            maxOddBinaryNum += "0";
        }

        maxOddBinaryNum += "1";

        return maxOddBinaryNum;
    }
}
