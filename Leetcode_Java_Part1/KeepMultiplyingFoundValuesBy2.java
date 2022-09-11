class Solution {
    public int findFinalValue(int[] nums, int original) { //1st solution
        int j = 0;
        Arrays.sort(nums);
        for(j = 0;  j < nums.length; j++){
            if(nums[j] == original) {
                nums[j] = 2 * nums[j];
                int temp = nums[j];
                nums[j] = original;
                original = temp;
            }
        }
        return original;
    }
    
  
    public int findFinalValue(int[] nums, int original) { //2nd solution
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for(int k = 0; k < nums.length; k++) {
            lst.add(nums[k]);
        }
        Collections.sort(lst);
        int j = 0;
        for(j = 0;  j < lst.size(); j++){
            if(lst.get(j) == original) {
                lst.set(j, 2 * lst.get(j));
                int temp = lst.get(j);
                lst.set(j, original);
                original = temp;
            }
        }
        return original;
    }
}


/*You are given an array of integers nums. You are also given an integer original which is the first number that needs to be searched for in nums.

You then do the following steps:

If original is found in nums, multiply it by two (i.e., set original = 2 * original).
Otherwise, stop the process.
Repeat this process with the new number as long as you keep finding the number.
Return the final value of original.*/
