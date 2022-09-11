class Solution {
    public String kthDistinct(String[] arr, int k) {
        int c = 0;
        for(int i = 0 ; i < arr.length; i++) {
            int count = 1;
            for(int j = 0 ; j < arr.length; j++) {
                if(arr[i].contentEquals(arr[j]) && j!=i) {
                    count++;
                }
            }
            if(count == 1) {
               c++;
            }
            if(c == k) {
                return arr[i];
            }
        }
        
        return "";
    }
}





/*A distinct string is a string that is present only once in an array.

Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".

Note that the strings are considered in the order in which they appear in the array.*/

