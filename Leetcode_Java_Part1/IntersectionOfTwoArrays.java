class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[]arr={};
        List<Integer> nums = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for(int i = 0 ; i < nums1.length; i++) {
            for(int j = 0 ; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    if(nums1.length <= nums2.length) {
                        nums.add(nums1[i]);
                    } else {
                        nums.add(nums2[j]);
                    }
                }
            }
        }
      
       List<Integer> distinctNums = nums.stream()
                                 .distinct()
                                 .collect(Collectors.toList());
        
        int[] result = distinctNums.stream().mapToInt(i->i).toArray();
        return result;
    }
    
    
   
}


/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.*/


