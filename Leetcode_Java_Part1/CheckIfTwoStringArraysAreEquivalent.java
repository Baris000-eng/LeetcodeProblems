class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String firstEmptyString = "", secondEmptyString = "";
        int firstLength = word1.length, secondLength = word2.length, i = 0, j = 0;
        for(i=0; i < firstLength; i++) {
            firstEmptyString = firstEmptyString + word1[i];
        }
        
        for(j=0; j < secondLength; j++) {
            secondEmptyString = secondEmptyString + word2[j];
        }
        
        
        return firstEmptyString.contentEquals(secondEmptyString);
    }
}



/*Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.*/

