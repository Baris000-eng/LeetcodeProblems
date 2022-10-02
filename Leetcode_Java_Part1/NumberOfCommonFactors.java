class Solution {
    public int countEven(int num) {
        int intsWithEvenDigitSum = 0;
        for(int i = 1 ; i <= num; i++) {
            if(digitSum(i)%2==0) {
               intsWithEvenDigitSum++;
            }
        }
        
        return intsWithEvenDigitSum;
    }
    
    
    public int digitSum(int num){
        int sum = 0;
        while(num>0){
            int remainder = num % 10;
            sum = sum + remainder;
            num = num / 10;
        }
        
        return sum;
    }
}

/* Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.

The digit sum of a positive integer is the sum of all its digits. */
