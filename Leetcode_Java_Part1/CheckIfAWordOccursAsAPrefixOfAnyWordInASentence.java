class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
       if(searchWord == null || searchWord.length() == 0 || sentence == null
          || sentence.length() == 0) {
            return 0;
        }
        String[]array = sentence.split(" ");
        boolean startsWithSearchWord = false;
        int min = array.length, len = array.length, i = 0;
        for(i = 0 ; i < len; i++) {
            if(array[i].startsWith(searchWord)){
               startsWithSearchWord = true;
               if(i+1<= min) {
                   min = i+1;
               }
            } 
        }
        
        if(startsWithSearchWord == false) {
            return -1;
        }
        return min;
    }
}

/*Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is a prefix of any word in sentence.

Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is a prefix of more than one word, return the index of the first word (minimum index). If there is no such word return -1.

A prefix of a string s is any leading contiguous substring of s.*/

