class Solution {
    public boolean isPalindrome(String s) {
     if(s == null) {
         return false;
     }
     s = s.trim();
     String empty = "";
     for(int i = 0 ; i < s.length(); i++) {
         char ch = s.charAt(i);
         if(!Character.isLetterOrDigit(ch)){
             s = s.replace(ch,' ');
         }
     }
     s = s.replaceAll("\\s+",""); //removing all whitespaces from the string called s.
     for(int j = s.length()-1; j >=0; j--) {
         empty = empty + s.charAt(j);
     }
        if(empty.toLowerCase().contentEquals(s.toLowerCase())) {
            return true;
        }
        
        
    
           return false;
     
        
    }
}

/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.*/

 


