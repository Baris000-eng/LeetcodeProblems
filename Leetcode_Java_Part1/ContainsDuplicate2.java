class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 0||nums == null||k<0) {
            return false;
        }
        Map<Integer,Integer> hashMap = new HashMap<>();
        int w = 0, len = nums.length;
        for(w = 0; w < len; w++){
            if(hashMap.containsKey(nums[w]) && w-hashMap.get(nums[w])<=k) {
                 return true;
            } else {
                hashMap.put(nums[w],w);
            }
        }
        return false;
    }
}


//Given an integer array nums and an integer k, return true if there are two distinct indices i and j 
//in the array such that nums[i] == nums[j] and abs(i - j) <= k.