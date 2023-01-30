class Solution {
    public int alternateDigitSum(int n) {
        String str = String.valueOf(n);
        int digitSum = 0;
        while(n > 0) {
            str = String.valueOf(n); // update to new string to alternate signs of digits.
            int remainder = n % 10;
            if(str.length() % 2 == 1) {
                digitSum = digitSum + remainder;
            } else {
                digitSum = digitSum - remainder;
            }
            n = n / 10;

        }

        return digitSum;
        
    }
}


//You are given a positive integer n. Each digit of n has a sign according to the following rules:

//The most significant digit is assigned a positive sign.
//Each other digit has an opposite sign to its adjacent digits.
//Return the sum of all digits with their corresponding sign.


