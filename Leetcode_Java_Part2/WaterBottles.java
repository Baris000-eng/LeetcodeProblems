class Solution {
public int numWaterBottles(int numBottles, int numExchange) {
    int bottleNum = numBottles;
    int takenFullBottles = numBottles/numExchange;
    while(takenFullBottles!=0){
        takenFullBottles = numBottles/numExchange;
        bottleNum = bottleNum + takenFullBottles;
        int remainder = numBottles%numExchange;
        numBottles = takenFullBottles + remainder;
    }
    return bottleNum;
}
}

/*There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.

The operation of drinking a full water bottle turns it into an empty bottle.

Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.*/