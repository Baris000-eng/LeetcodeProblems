class Solution {
    public String truncateSentence(String s, int k) {
        String empty = "";
        if(s.length() == 0 || k<=0) { //for invalid and imaginary cases
            return "";
        }
        String[]array = s.split(" ");
        for(int i = 0 ; i < k; i++) {
            if(i==k-1) {
                 empty = empty + array[i];
            } else {
                 empty = empty + array[i] + " ";
            }
        }
        return empty;
    }
}



/* A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it. */