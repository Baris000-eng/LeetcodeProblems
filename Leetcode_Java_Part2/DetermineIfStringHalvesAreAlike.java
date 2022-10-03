class Solution {
    public boolean halvesAreAlike(String s) {
        int firstHalfVowelCount = 0, secondHalfVowelCount = 0;
        for(int i = 0 ; i < s.length()/2; i++) {
            if(isVowel(s.charAt(i))) {
                firstHalfVowelCount++;
            }
        }
        
        for(int j = s.length()/2 ; j < s.length(); j++) {
            if(isVowel(s.charAt(j))) {
                secondHalfVowelCount++;
            }
        }
        
        return firstHalfVowelCount == secondHalfVowelCount;
    }

    public boolean isVowel(char c) {
        if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||     c=='u' || c=='U') {    
            return true;
        }    
        return false;
    }    
}

/* You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false. */