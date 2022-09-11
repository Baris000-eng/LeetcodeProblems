class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer>lst = new ArrayList<Integer>();
        int indexCount = 0;
        for(int i = 0 ; i < nums.length; i++) {
           for(int j = 0 ; j < nums.length; j++) {
               if(nums[j] == key && Math.abs(i-j) <= k) {
                  lst.add(i);
               }
           }
        }
        
        Collections.sort(lst);
        List<Integer> distinctLst = lst.stream()
                                 .distinct()
                                 .collect(Collectors.toList());
        return distinctLst;
    }
}


/*You are given a 0-indexed integer array nums and two integers key and k. A k-distant index is an index i of nums for which there exists at least one index j such that |i - j| <= k and nums[j] == key.

Return a list of all k-distant indices sorted in increasing order.*/