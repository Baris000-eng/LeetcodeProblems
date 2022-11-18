class Solution {
    public int distinctAverages(int[] nums) {
        List<Integer> integerList = new ArrayList<Integer>();
        List<Double> averages = new ArrayList<Double>();
        for(int j = 0 ; j < nums.length; j++) {
            integerList.add(nums[j]);
        }
        
        Collections.sort(integerList);
        for(int i = 0 ; i <= integerList.size() - 1; i++) {
                if (i != integerList.size()-1-i) {
                     int sum = integerList.get(i) + integerList.get(integerList.size()-1-i);
                     double average = (sum * (1.0)) / 2;
                     averages.add(average);
                }
        }
        
        HashSet<Double> uniques = new HashSet<Double>(averages);
        return uniques.size();
    }
}

//You are given a 0-indexed integer array nums of even length.

//As long as nums is not empty, you must repetitively:

//////Find the minimum number in nums and remove it.
//////Find the maximum number in nums and remove it.
//////Calculate the average of the two removed numbers.
//////The average of two numbers a and b is (a + b) / 2.

//////For example, the average of 2 and 3 is (2 + 3) / 2 = 2.5.
//////Return the number of distinct averages calculated using the above process.

//////Note that when there is a tie for a minimum or maximum number, any can be removed.
