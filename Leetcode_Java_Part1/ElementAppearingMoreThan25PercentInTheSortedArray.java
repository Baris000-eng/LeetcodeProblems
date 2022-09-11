class Solution {
    public int findSpecialInteger(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length; i++) {
            int count = 1;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j] && i!=j) {
                    count++;
                }
            }
            if(count > arr.length / 4) {
                return arr[i];
            }
        }
        
        
        return 0;
    }
}


/*Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.*/


