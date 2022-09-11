class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.isEmpty() || word.isBlank()) { //for handling blank word and empty word cases
            return false;
        }
        int charNum1 = 0, charNum2 = 0, charNum3 = 0, j = 0;
        for(j=0;j<word.length();j++) {
            if(Character.isUpperCase(word.charAt(j))){
                charNum1++;
            }
            if(!Character.isUpperCase(word.charAt(j))){
                charNum2++;
            }
            if(Character.isUpperCase(word.charAt(0)) && j!=0 && !Character.isUpperCase(word.charAt(j))){
                charNum3++;
            }
        }
        if(charNum1 == word.length()||charNum2==word.length()||charNum3==word.length()-1) {
            return true;
        }
        return false;
    }
}

        // We define the usage of capitals in a word to be right when one of the following cases holds:

       // All letters in this word are capitals, like "USA".
      //  All letters in this word are not capitals, like "leetcode".
      //  Only the first letter in this word is capital, like "Google".
      //  Given a string word, return true if the usage of capitals in it is right.