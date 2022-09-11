class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num % 2 == 1||num <= 0) {
            return false;
        }
        int sum = 0;
        for(int i = 1; i < num; i++) {
            int remainder = num % i;
            if(remainder == 0) {
                sum = sum + i;
            }
        }
        
        
        
        if(sum == num) {
            return true;
        }
        
            return false;
  
    }
}

//A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding 
//the number itself. A divisor of an integer x is an integer that can divide x evenly.

//Given an integer n, return true if n is a perfect number, otherwise return false.