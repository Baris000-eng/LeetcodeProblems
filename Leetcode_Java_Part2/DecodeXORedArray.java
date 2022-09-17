class Solution {
    public int[] decode(int[] encoded, int first) {
        int length = encoded.length, j = 0;
        int[] result = new int[length+1];
        result[0] = first;
        for (j = 0; j < length; j++) {
            result[j+1]= result[j] ^ encoded[j];
        }
        return result;
    }
}



 /* There is a hidden integer array arr that consists of n non-negative integers.

It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].

You are given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].

Return the original array arr. It can be proved that the answer exists and is unique.  */

