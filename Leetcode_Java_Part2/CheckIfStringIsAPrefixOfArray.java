class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String result = "";
        int k = 0;
        for(k = 0 ; k < words.length; k++) {
            result = result + words[k];
            if(result.contentEquals(s)) {
                return true;
            }
        }
        
        return false;
    }
}


/*Given a string s and an array of strings words, determine whether s is a prefix string of words.

A string s is a prefix string of words if s can be made by concatenating the first k strings in words for some positive k no larger than words.length.

Return true if s is a prefix string of words, or false otherwise.*/

 