class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n>0) {
            int rem = n%10;
            product = product * rem;
            sum = sum + rem;
            n = n / 10;
        }
        
        int difference = product - sum;
        if(difference <= 0) {
            difference = -1 * difference;
        }
        return difference;
    }
}

///Given an integer number n, return the difference between the product of its digits and the sum of its digits.
