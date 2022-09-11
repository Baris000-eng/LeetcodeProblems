class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0 , i = 0, j = 0, accountsLen = accounts.length;
        for(i = 0; i < accountsLen; i++){    
            int rowSum = 0; 
            int len = accounts[i].length;
            for(j = 0; j < len; j++){    
              rowSum = rowSum + accounts[i][j];    
            } 
           
            if(rowSum >= maxWealth) {
                maxWealth = rowSum;
            }
             
        }    
        return maxWealth;
    }
}


/*You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.*/

/*Constraints:

m == accounts.length
n == accounts[i].length
1 <= m, n <= 50
1 <= accounts[i][j] <= 100*/

