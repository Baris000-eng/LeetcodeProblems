/*Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.

You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.

Return the final string that will be present on your laptop screen.*/

class Solution {
    public String finalString(String s) {
        String finalStr = "";
        for(int i = 0 ; i < s.length(); i++) {
            if(s.charAt(i) == 'i') {
                finalStr = reverseString(finalStr);
            } else {
                finalStr += s.charAt(i);
            }
        }

        return finalStr;


    }



    public String reverseString(String str) {
        String string = "";
        for(int j = str.length()-1; j>=0; j--) {
            string += str.charAt(j);
        }

        return string;
    }
}
