class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWordNum = 0;
        for(int i = 0 ; i < sentences.length; i++) {
            String[]splitArray = sentences[i].split(" ");
            if(splitArray.length >= maxWordNum) {
                maxWordNum = splitArray.length;
            }
        }
        return maxWordNum;
    }
}

/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.*/
 