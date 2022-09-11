class Solution {
    public String reverseWords(String s) {
        String blank = "";
        for(int i = s.length() - 1 ; i>=0 ; i--) { //reverse the given parameter string
            blank = blank + s.charAt(i);
        }
        String[]stringArray = blank.split(" ");
        String result = "";
        for(int i = stringArray.length-1; i>=0 ; i--) { //add strings in reversed order to the result string
                 result = result + stringArray[i] + " ";
        }
        return result.trim();
       
    }
}




//Given a string s, reverse the order of characters in each word within a sentence while still 
/////preserving whitespace and initial word order.

