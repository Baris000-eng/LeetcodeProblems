class Solution {
    public int uniqueMorseRepresentations(String[] words) {
    String[]morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    String[]alphabet={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        List<String>list = new ArrayList<String>();
        for(int i = 0 ; i < words.length; i++) {
            String word = "";
            for(int j = 0 ; j < words[i].length(); j++) {
             word = word.concat(morse[findIndex(alphabet,String.valueOf(words[i].charAt(j)))]);
            }
            list.add(word);
        }
        
        List<String> distinctStrings = list.stream()
                                 .distinct()
                                 .collect(Collectors.toList());
        return distinctStrings.size();
    }
                                                                       
                                                                                                                                     
    public static int findIndex(String arr[], String target) {
        boolean equal = false;
        int index = 0;
        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i].contentEquals(target)) {
                index = i;
                equal = true;
            }
        }
        
        if(equal == false) {
            return -1;
        }
       
        return index;
    }
}



/* International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:

'a' maps to ".-",
'b' maps to "-...",
'c' maps to "-.-.", and so on.
For convenience, the full table for the 26 letters of the English alphabet is given below: */