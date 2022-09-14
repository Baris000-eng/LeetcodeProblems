class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character>firstWord = new ArrayList<Character>();
        List<Character>secondWord = new ArrayList<Character>();
        for(int i = 0 ; i < s.length(); i++) {
            firstWord.add(s.charAt(i));
        }
        
         for(int i = 0 ; i < t.length(); i++) {
            secondWord.add(t.charAt(i));
        }
        Collections.sort(firstWord);
        Collections.sort(secondWord);
        return firstWord.equals(secondWord);
    }
}


/* Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. */
