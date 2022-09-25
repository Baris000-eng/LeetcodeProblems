import java.util.*;
class Solution {
    public String sortSentence(String s) {
        String [] splitArray = s.split(" ");
        int j = 0, len = splitArray.length;
        String [] array = new String[len];
        for(j=0; j<len; j++){
            int location=Integer.parseInt(String.valueOf(splitArray[j].charAt(splitArray[j].length()-1)));
            String word = splitArray[j].substring(0,splitArray[j].length()-1);
            array[location-1] = word;
        }
        String resultString = "";
        for(j=0; j < array.length; j++) {
            resultString = resultString + array[j] + " ";
        }
        
        return resultString.trim();
    }
    
}

/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence. */

