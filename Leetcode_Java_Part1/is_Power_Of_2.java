class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1) {
            return false;
        } else if(n==1) {
            return true;
        }

        while (n > 1) {
            if (n%2 == 1) {
                return false;
            }
            n = n/2;
        }

        return true;



    }
}