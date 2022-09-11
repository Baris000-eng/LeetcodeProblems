class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
        String num1 = "", num2 = "",stringPattern = "^0+(?!$)", str = "abcdefghijklmnopqrstuvwxyz";
       
        for(int i = 0 ; i < firstWord.length(); i++) {
            char chFirst = firstWord.charAt(i);
            int index = str.indexOf(chFirst);
            num1 = num1 + String.valueOf(index);
        }
        
        num1 = num1.replaceAll(stringPattern, "");
       
        
        for(int j = 0 ; j < secondWord.length(); j++) {
            char chSecond = secondWord.charAt(j);
            int index = str.indexOf(chSecond);
            num2 = num2 + String.valueOf(index);
        }
        
         num2 = num2.replaceAll(stringPattern, "");
        
        String result = "";
        
        for(int j = 0 ; j < targetWord.length(); j++) {
            char chTarget = targetWord.charAt(j);
            int index = str.indexOf(chTarget);
            result = result + String.valueOf(index);
        }
        
        result = result.replaceAll(stringPattern, "");
        
        
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int resultNum = Integer.parseInt(result);
        
        return number1 + number2 == resultNum;
        
        
        
    }
}

/*The letter value of a letter is its position in the alphabet starting from 0 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, etc.).

The numerical value of some string of lowercase English letters s is the concatenation of the letter values of each letter in s, which is then converted into an integer.

For example, if s = "acb", we concatenate each letter's letter value, resulting in "021". After converting it, we get 21.
You are given three strings firstWord, secondWord, and targetWord, each consisting of lowercase English letters 'a' through 'j' inclusive.

Return true if the summation of the numerical values of firstWord and secondWord equals the numerical value of targetWord, or false otherwise.*/



