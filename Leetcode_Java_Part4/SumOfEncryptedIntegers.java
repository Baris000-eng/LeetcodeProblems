/*You are given an integer array nums containing positive integers. We define a function encrypt such that encrypt(x) replaces every digit in x with the largest digit in x. For example, encrypt(523) = 555 and encrypt(213) = 333.

Return the sum of encrypted elements.

 

Example 1:

Input: nums = [1,2,3]

Output: 6

Explanation: The encrypted elements are [1,2,3]. The sum of encrypted elements is 1 + 2 + 3 == 6.

Example 2:

Input: nums = [10,21,31]

Output: 66

Explanation: The encrypted elements are [11,22,33]. The sum of encrypted elements is 11 + 22 + 33 == 66.

 

Constraints:

1 <= nums.length <= 50
1 <= nums[i] <= 1000*/

class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int encryptedSum = 0;
        for(int i = 0 ; i < nums.length; i++) {
            int encrypted = encryptedInteger(nums[i]);
            encryptedSum += encrypted;
        }

        return encryptedSum;
    }


    public int encryptedInteger(int num) {
        int maxDigit = 0;
        int i = 0;

        String str = "";
        while(num > 0) {
            int remainder = num % 10;
            if(remainder >= maxDigit) {
                maxDigit = remainder;
            }

            num = num / 10;
            i++;
        }

        for(int j = 0 ; j < i; j++) {
            str += String.valueOf(maxDigit);
        }  


        return Integer.valueOf(str); 
     }



}