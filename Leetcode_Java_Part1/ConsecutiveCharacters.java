class Solution {
    public int maxPower(String s) {
      int maximumLength = 1;
      int length = 1, j = 0;
      int l = s.length();
      for(j = 0; j<l; j++) {
          if(j+1 <= l-1) {
                if(s.charAt(j+1) == s.charAt(j)) {
                    length++;
                    if(length >= maximumLength) {
                        maximumLength = length;
                    }
                } else{
                    length = 1;
                }
          }
      }
        
        
      return maximumLength;
    
    
    }
}

/* The power of the string is the maximum length of a non-empty substring that contains only one unique character.

Given a string s, return the power of s. */

