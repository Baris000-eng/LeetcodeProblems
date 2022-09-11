class Solution {
    public int thirdMax(int[] nums) {
        int max = nums[0], index = 0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < nums.length; i++) {
            list.add(nums[i]);
        }
        
         List<Integer> distinctInts = list.stream()
                                 .distinct()
                                 .collect(Collectors.toList());
        
        if(distinctInts.size() >= 3) {
            max = Collections.max(distinctInts);
            index = distinctInts.indexOf(max);
            distinctInts.set(index,Integer.MIN_VALUE);
            max = Collections.max(distinctInts);
            index = distinctInts.indexOf(max);
            distinctInts.set(index,Integer.MIN_VALUE);
            max = Collections.max(distinctInts);
            return max;
        } 
        
        return Collections.max(distinctInts);
    }
}

/*Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.*/


