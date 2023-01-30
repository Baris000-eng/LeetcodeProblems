class Solution {
public int getCommon(int[] nums1, int[] nums2) {
    Set<Integer> firstSet = new HashSet<>();
    for (int num : nums1) {
        firstSet.add(num);
    } 

    int minValue = Integer.MAX_VALUE;
    for (int num : nums2) {
        if (firstSet.contains(num) && num < minValue) {
            minValue = num;
        }
    }
    
    if(minValue == Integer.MAX_VALUE)  {
        return -1;
    }
    

    return minValue;
}
}


//Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst 
////nums1 and nums2, return -1.

//Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.