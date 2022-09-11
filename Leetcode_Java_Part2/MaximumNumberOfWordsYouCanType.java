class Solution {
  public int canBeTypedWords(String text, String brokenLetters) {
        String[] stringArray = text.split(" ");
        int wordCount=0, len = stringArray.length, brokenLen = brokenLetters.length(), i = 0 , j = 0;
      
        for(i = 0 ; i < len; i++) {
            boolean textContainsBrokenLetters =false;
            for(j=0; j< brokenLen; j++){
     if(stringArray[i].contains(Character.toString(brokenLetters.charAt(j)))){
                    textContainsBrokenLetters=true;
                    break;
                }
            }
            if(textContainsBrokenLetters == false) {
                wordCount++;
            }
        }
        return wordCount;
    }
}



/*There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.

Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.*/


