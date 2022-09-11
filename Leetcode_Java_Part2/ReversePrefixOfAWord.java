class Solution {
    public String reversePrefix(String word, char ch) {
        String empty = "";
        for(int i = word.indexOf(ch); i>=0; i--) {
            empty = empty + word.charAt(i);
        }
        return empty + word.substring(word.indexOf(ch)+1,word.length());
    }
}

/*Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".*/
Return the resulting string.