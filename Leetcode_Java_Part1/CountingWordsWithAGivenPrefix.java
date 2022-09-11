class Solution {
    public int prefixCount(String[] words, String pref) {
        int j = 0 , len = words.length, countWordsWithASpecificPrefix = 0;
        for(j = 0 ; j < len; j++) {
            if(words[j].startsWith(pref)) {
                countWordsWithASpecificPrefix++;
            }
        }
        
        return countWordsWithASpecificPrefix;
    }
}

/*You are given an array of strings words and a string pref.

Return the number of strings in words that contain pref as a prefix.

A prefix of a string s is any leading contiguous substring of s.*/
