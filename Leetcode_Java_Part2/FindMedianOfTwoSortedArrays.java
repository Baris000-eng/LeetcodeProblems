class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>mergedList = new ArrayList<Integer>();
        for(int i = 0 ; i < nums1.length; i++) {
            mergedList.add(nums1[i]);
        }
        
        for(int j = 0; j < nums2.length; j++) {
             mergedList.add(nums2[j]);
        }

        
        Collections.sort(mergedList);
        
        if(mergedList.size() % 2 == 1) {
            return 1.0 * mergedList.get((mergedList.size()-1)/2);
        }
        
        
            return  (mergedList.get((mergedList.size()-1)/2) +  mergedList.get((mergedList.size()+1)/2))/2.0;
    }
}


/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.*/
