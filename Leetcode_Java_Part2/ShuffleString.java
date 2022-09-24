class Solution {
    public String restoreString(String s, int[] indices) {
        char[]arr = new char[s.length()];
        int j = 0, len = s.length();
        for(j = 0 ; j < len; j++) {
           arr[indices[j]] = s.charAt(j);
        }
        String resultString = new String(arr);
        return resultString;
    }
}

/* You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string. */

