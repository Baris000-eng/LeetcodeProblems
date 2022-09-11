class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>lst = new ArrayList<List<Integer>>();
        List<Integer>list1 = new ArrayList<Integer>();
        List<Integer>list2 = new ArrayList<Integer>();
        
        List<Integer> nums1L = Arrays.stream(nums1).boxed().distinct().collect(Collectors.toList());
         List<Integer> nums2L = Arrays.stream(nums2).boxed().distinct().collect(Collectors.toList());
        
        for(int i = 0 ; i < nums1L.size(); i++) {
                if(!nums2L.contains(nums1L.get(i))) {
                    list1.add(nums1L.get(i));
                } 
        }
        
        for(int j = 0 ; j < nums2L.size(); j++) {
             if(!nums1L.contains(nums2L.get(j))) {
                    list2.add(nums2L.get(j));
             } 
        }
        
        lst.add(list1);
        lst.add(list2);
        return lst;
        
    }
}


/*Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.*/


