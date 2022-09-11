class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNums = new ArrayList<Integer>();
        int len = nums.length , i = 0;
        boolean[] isVisited = new boolean[len];
        for(i= 0;i<len;i++){
            isVisited[nums[i]-1] = true;
        }
        for(i= 0;i<len;i++){
            if(isVisited[i] == false){
               disappearedNums.add(i+1);
            }
        }
        return disappearedNums;
    }
}



/*Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums*/

