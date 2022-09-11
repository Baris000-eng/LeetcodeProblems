class Solution {
    public double myPow(double x, int n) {
        if(n < 0 && x != 0) {
            x = 1 / x;
            n = - n;
        }
        
        if(x == -1 && n%2==1) {
            return -1;
        } else if( (x == -1 && n%2==0) || (x == 1) ) {
            return 1;
        } else if(n == Integer.MIN_VALUE) {
            return 0;
        } else if(x == 0 && n == 0) { //for the invalid case
            return -1;
        }
        double mult = 1.0;
        int i = 0;
        for(i = 0 ; i < n; i++) {
            mult = mult * x;
        }
        return mult;
    }
}

//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).


