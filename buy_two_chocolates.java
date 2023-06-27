/* You are given an integer array of prices representing the prices of various chocolates in a store. 
You are also given a single integer of money, which represents your initial amount of money.
You must buy exactly two chocolates in such a way that you still have some non-negative leftover money. 
You would like to minimize the sum of the prices of the two chocolates you buy.
Return the amount of money you will have leftover after buying the two chocolates. 
If there is no way for you to buy two chocolates without ending up in debt, return the money. 
Note that the leftover must be non-negative. */

class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < prices.length; i++) {
            for(int j = i + 1 ; j < prices.length ; j++) {
                int sum = prices[i] + prices[j];
                if(sum <= min) {
                    min = sum;
                }
            }
        }

        if(min > money) {
            return money;
        }

        int remaining = money - min;
        return remaining;
       
    }
}
