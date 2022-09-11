class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        boolean threeConsecutiveOddNumsExist = false;
        for(int i = 0 ; i < arr.length; i++) {
            if(i+1 <= arr.length-1 && i-1 >= 0) {
                if(arr[i+1] % 2 == 1 && arr[i] % 2 == 1 && arr[i-1] % 2 == 1) {
                    threeConsecutiveOddNumsExist = true;
                }
            }
        }
        
        
        return threeConsecutiveOddNumsExist;
    }
}



/*Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.*/
 