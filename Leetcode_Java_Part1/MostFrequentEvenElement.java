class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map = new TreeMap<>();
        int len = nums.length, j = 0;
        for(j = 0 ; j < len; j++) {
            if(nums[j]%2 == 0) {
                int frequency = map.getOrDefault(nums[j],0)+1;
                map.put(nums[j],frequency);
            }
        }
       
        int newKey = -1, maxVal = Integer.MIN_VALUE, myVal = 0;
        Set<Integer> s = map.keySet();
        for(int myKey : s){
            myVal = map.get(myKey);
            if(myVal > maxVal) {
                maxVal = myVal;
                newKey = myKey;
            }
        }
        
        return newKey;
       
        
        
    }
}

/*Given an integer array nums, return the most frequent even element.

If there is a tie, return the smallest one. If there is no such element, return -1.*/

