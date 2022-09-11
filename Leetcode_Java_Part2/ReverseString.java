class Solution {
    public void reverseString(char[] s) {
        int i = 0, j = 0, len = s.length;
        char temp = ' ';
        if(len%2==1) {
             for(i = 0 ; i <= len/2; i++) {
                 temp = s[i];
                 s[i] = s[len-1-i];
                 s[len-1-i] = temp;
             }
        } else {
            for(j = 0 ; j < len/2; j++) {
                 temp = s[j];
                 s[j] = s[len-1-j];
                 s[len-1-j] = temp;
             }
        }  
    }
}

/* Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory. */

