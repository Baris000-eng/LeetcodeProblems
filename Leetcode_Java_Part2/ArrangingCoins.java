class Solution {
    public int arrangeCoins(int n) { // my first solution
       int i = 1;
       while(true) {
           n = n - i;
           if(n<0) {
               return i-1;
           }
           i++;
       } 
    }

     public int arrangeCoinsSecondSolution(int n) { // my second solution
       int i = 1;
       int sum = 0;
       while(true) {
           sum = sum + i;
           n = n - i;
           i++;
           if(n<i) {
               return i-1;
           }
       } 
     }
}


/*You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.*/