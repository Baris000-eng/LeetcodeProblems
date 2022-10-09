class Solution {
    public boolean isStrictlyPalindromic(int n) {
        boolean strictlyPalindrome = true;
        for(int i = 2 ; i<= n-2; i++) {
            String binary = Integer.toString(n,i);
            if(!isPalindrome(binary)) {
                strictlyPalindrome = false;
            } 
        }
        return strictlyPalindrome;
    }
    
    
    
    public boolean isPalindrome(String string) {
        String res = "";
        for(int i = string.length()-1; i>=0; i--) {
            res = res + string.charAt(i);
        }
        
        return res.contentEquals(string);
    }
}

/* An integer n is strictly palindromic if, for every base b between 2 and n - 2 (inclusive), the string representation of the integer n in base b is palindromic.

Given an integer n, return true if n is strictly palindromic and false otherwise.

A string is palindromic if it reads the same forward and backward. */


