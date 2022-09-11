class Solution {
    public int countOdds(int low, int high) {
       int numAmount = high - low + 1;
        if(high%2 == 0 || low%2 == 0) {
            return numAmount/2;
        }
        return numAmount/2 + 1;
    }
}


//Given two non-negative integers low and high. Return the count of odd numbers between low and high 
//(inclusive).

