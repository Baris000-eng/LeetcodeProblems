class Solution {
    public int totalMoney(int n) {
         int totalMoneyAmount = 0;
         int j = 0;
         for(j = 0 ; j < n; j++) {
            int remainder = j % 7; 
            int div = j / 7; 
            totalMoneyAmount = totalMoneyAmount + remainder + div + 1;
         }
        return totalMoneyAmount;
    }
}

/*Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.

He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.

Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.*/




