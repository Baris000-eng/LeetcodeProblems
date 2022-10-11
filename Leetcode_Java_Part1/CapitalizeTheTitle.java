class Solution {
    public String capitalizeTitle(String title) {
        if(title.length() == 0) {
		return "";
	}
        String[]array = title.split(" ");
        String result = "";
        for(int i = 0 ; i < array.length; i++) {
            String word = array[i];
            if(word.length() == 1 || word.length() == 2) {
                word = word.toLowerCase();
            } else {
                String firstLetter = word.substring(0,1);
                String rest = word.substring(1);
                firstLetter = firstLetter.toUpperCase();
                rest = rest.toLowerCase();
                word = firstLetter.concat(rest);
            }
            
            result = result + word;
            
            if(i <= array.length-2) {
                result = result + " ";
            }
        }
        
        return result;
    }
}


/* You are given a string title consisting of one or more words separated by a single space, where each word consists of English letters. Capitalize the string by changing the capitalization of each word such that:

If the length of the word is 1 or 2 letters, change all letters to lowercase.
Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
Return the capitalized title. */



