class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       int len = nums.length , k = 0, l = 0;
       int[] resultArray = new int[len];
       for(k=0; k<len; k++) {
        int numCount = 0;
        for(l=0; l<len; l++) {
            if (k!=l && nums[l] < nums[k]) {
                numCount++;
            }
        }
        resultArray[k] = numCount;
    }
    return resultArray;
	}
}



//Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
//That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < 

//nums[i].

//Return the answer in an array.