class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arrayWithNextGreaters = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int max = -1;
            for (int j = findIndex(nums2, nums1[i]); j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    max = nums2[j];
                    break;
                }
            }
            arrayWithNextGreaters[i] = max;
        }
        return arrayWithNextGreaters;
    }

    private int findIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
