class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer>list = new ArrayList<Integer>();
        for(int i = 0 ; i < nums.length; i++) {
            if(i%2 == 0 && i+1 <= nums.length-1) {
                for(int j = 0 ; j < nums[i]; j++) {
                    list.add(nums[i+1]);
                }
            }   
        }
        
        
      int[] result = list.stream().mapToInt(Integer::intValue).toArray();
      return result;
        
    }
}

/* We are given a list nums of integers representing a list compressed with run-length encoding.

Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.

Return the decompressed list. */