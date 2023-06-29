/* You are given a 0-indexed array words consisting of distinct strings.
The string words[i] can be paired with the string words[j] if:
The string words[i] is equal to the reversed string of words[j].
0 <= i < j < words.length.
Return the maximum number of pairs that can be formed from the array words.
Note that each string can belong in at most one pair. */

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int maxStringPairNum = 0;
        for(int i = 0 ; i < words.length; i++) {
            for(int j = i+1 ; j < words.length; j++) {
                if(is_reversed(words[i], words[j])) {
                    maxStringPairNum += 1;
                }
            }
        }

        return maxStringPairNum;
    }

   public boolean is_reversed(String str1, String str2) {
    if (str1.length() != str2.length()) {
       return false;
    }
    
    return new StringBuilder(str1).reverse().toString().equals(str2);

   }

}
