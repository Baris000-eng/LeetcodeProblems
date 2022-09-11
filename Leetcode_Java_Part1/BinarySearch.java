class Solution {
public int search(int[] nums, int target) {
    int rightIndex = nums.length-1;
    int leftIndex = 0;
    int middleIndex = (rightIndex + leftIndex) / 2;
    while(rightIndex - leftIndex >= 0)  {
        if(nums[middleIndex] > target) {
            rightIndex = middleIndex - 1;
        } else if(nums[middleIndex] < target) {
            leftIndex = middleIndex + 1;
        } else {
            return middleIndex;
        }
        middleIndex = (rightIndex + leftIndex) / 2;
    }
    
    return -1;
}
}
   


