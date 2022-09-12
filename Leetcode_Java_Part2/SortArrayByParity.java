class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer>lst = new ArrayList<Integer>();
        for(int i = 0 ; i < nums.length; i++) {
            if(nums[i]%2==0) {
                lst.add(nums[i]);
            }
        }
        
       for(int i = 0 ; i < nums.length; i++) {
            if(nums[i]%2==1) {
                lst.add(nums[i]);
            }
        }
        
        int[] result = lst.stream().mapToInt(Integer::intValue).toArray();
        return result;
        
        
        
    }
}

/* Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition. */