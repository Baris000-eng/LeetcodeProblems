class Solution {
    
public int maxProfit(int[] prices) {
    int maxProfit = 0, j = 0, minPrice = prices[0], len = prices.length, profit = 0; //definition of the necessary variables
    for(j=0; j< len; j++){ //go through the prices array
        
        if(prices[j] < minPrice){ //find the minimum price in the array
            minPrice = prices[j]; //assign the minimum price to the foundd min price in the array
        }
        if(j+1 <= len-1) { //if the index is in valid boundary
            profit = prices[j+1] - minPrice; //find the current profit starting from the index j == 1.
            if(profit > maxProfit){ //if profit is bigger than max profit
                maxProfit= profit; //assign profit to max profit
            }  
        }
    }    
    return maxProfit; //return max profit
}
}

/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/
    



//7,6,5,4,3,2,1
//minPrice = 7         //6,5,4,3,2,1
//prices[i+1]          //6,5,4,3,2,1
//profits              //0,0,0,0,0,0
//In this situation, profits are 0 for all prices. Thus, there is no profit bigger than the value of the variable called maxProfit (the value of the variable called maxProfit is 0).

