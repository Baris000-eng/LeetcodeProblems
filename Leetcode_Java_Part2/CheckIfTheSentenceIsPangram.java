class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean isPangram = true;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0 ; i < alphabet.length(); i++) {
            if(!sentence.contains(String.valueOf(alphabet.charAt(i)))){
                isPangram = false;
            }
        }
        return isPangram;
    }
}

/* A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise. */

