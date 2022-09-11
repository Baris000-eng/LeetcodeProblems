class Solution {
    public int countEven(int num) {
    int integersWithEvenDigitSum = 0, i = 0;
    for (i = 1; i <= num; i++) {
        int n = i;
        int sum = 0;
        while (n > 0 ) {
            sum = sum + n%10;
            n = n / 10;
        }
        if (sum % 2 == 0) {
            integersWithEvenDigitSum++;
        }
    }
    return integersWithEvenDigitSum;
    }
}


//Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.

//The digit sum of a positive integer is the sum of all its digits.
