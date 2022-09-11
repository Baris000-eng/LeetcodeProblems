class Solution {
    public int sumOfUnique(int[] nums) {
      int uniqueSum = 0;
      for(int i = 0 ; i < nums.length; i++) {
          boolean visited = false;
          for(int j = 0 ; j< nums.length; j++) {
              if(nums[i]==nums[j] && i!=j) {
                   visited = true;
              }
          }
          if(visited == false) {
              uniqueSum = uniqueSum + nums[i];
          }
      } 
     return uniqueSum;
    }
}


/*You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.*/

