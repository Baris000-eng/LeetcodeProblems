class Solution {
    public String mergeAlternately(String word1, String word2) {
        String mergedStr = "";
        if(word1.length() == word2.length()) {
            for(int i = 0 ; i < word1.length(); i++) {
                    mergedStr = mergedStr + word1.charAt(i) + word2.charAt(i);
            }
        } else if(word1.length() > word2.length()) {
            for(int i = 0 ; i < word2.length(); i++) {
                    mergedStr = mergedStr + word1.charAt(i) + word2.charAt(i);
            }
            for(int j = word2.length(); j < word1.length(); j++) {
                mergedStr = mergedStr + word1.charAt(j);
            }

        } else if(word2.length() > word1.length()) {
            for(int i = 0 ; i < word1.length(); i++) {
                    mergedStr = mergedStr + word1.charAt(i) + word2.charAt(i);
            }
            for(int j = word1.length(); j < word2.length(); j++) {
                mergedStr = mergedStr + word2.charAt(j);
            }
        }
        return mergedStr;
    }
}

//You are given two strings word1 and word2. Merge the strings by adding letters in alternating ////order, starting with word1. If a string is longer than the other, 
//append the additional letters onto the end of the merged string.

//Return the merged string.

 

//Example 1:

//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
Explanation: The merged string will be merged as so:
//word1:  a   b   c
//word2:    p   q   r
//merged: a p b q c r

Example 2:

//Input: word1 = "ab", word2 = "pqrs"
//Output: "apbqrs"
//Explanation: Notice that as word2 is longer, "rs" is appended to the end.
//word1:  a   b 
//word2:    p   q   r   s
//merged: a p b q   r   s

//Example 3:

//Input: word1 = "abcd", word2 = "pq"
//Output: "apbqcd"
//Explanation: Notice that as word1 is longer, "cd" is appended to the end.
//word1:  a   b   c   d
//word2:    p   q 
//merged: a p b q c   d
 

//Constraints:

//1 <= word1.length, word2.length <= 100
//word1 and word2 consist of lowercase English letters.