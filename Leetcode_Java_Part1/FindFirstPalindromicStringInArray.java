class Solution {
     /* public String firstPalindrome(String[] words) { //My first solution
        boolean palindromeDoesNotExist = false;
        for(int i = 0 ; i < words.length; i++) {
            String empty = "";
            for(int j = words[i].length()-1; j>=0; j--){
                empty = empty + words[i].charAt(j);
            }
            if(empty.contentEquals(words[i])) {
                palindromeDoesNotExist = true;
                return empty;
            }
        }
        
        if(palindromeDoesNotExist == false) {
            return "";
        }
        
        return "";
    } */

    public String firstPalindrome(String[] words) { //My second solution
        boolean palindromeDoesNotExist = false;
        for(int i = 0 ; i < words.length; i++) {
           String reversedString = new StringBuilder(words[i]).reverse().toString();
            if(reversedString.contentEquals(words[i])) {
                return reversedString;
            }
        }
        
        return "";
    }

/*Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.*/

}



