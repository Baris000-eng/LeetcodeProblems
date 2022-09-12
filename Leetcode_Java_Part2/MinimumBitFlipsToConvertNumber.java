class Solution {
    //0011
    //0100
    public int minBitFlips(int start, int goal) {
        if(start == goal) {
            return 0;
        }
        String stringStart = Integer.toBinaryString(start);
        String stringGoal = Integer.toBinaryString(goal);
        
  	while(stringStart.length()!=stringGoal.length()) {
   	 	if(start > goal && stringGoal.length()<stringStart.length()) {
                  	stringGoal = "0" + stringGoal;
    	 	} else if(goal > start && stringGoal.length()>stringStart.length()) {
                  stringStart = "0" + stringStart;
    	 	}
  	}

  	int count = 0, j = 0;
  	for(j = 0; j < stringGoal.length(); j++) {
    		if(stringStart.charAt(j) != stringGoal.charAt(j)){
        		count++;
    		}
	}
        
        return count;
        
    }
}


/*A bit flip of a number x is choosing a bit in the binary representation of x and flipping it from either 0 to 1 or 1 to 0.

For example, for x = 7, the binary representation is 111 and we may choose any bit (including any leading zeros not shown) and flip it. We can flip the first bit from the right to get 110, flip the second bit from the right to get 101, flip the fifth bit from the right (a leading zero) to get 10111, etc.
Given two integers start and goal, return the minimum number of bit flips to convert start to goal.*/