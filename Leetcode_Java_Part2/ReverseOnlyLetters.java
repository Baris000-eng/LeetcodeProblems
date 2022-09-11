class Solution {
    public String reverseOnlyLetters(String s) {
        String empty = "";
        List<Character>lst = new ArrayList<Character>();
        for(int i = 0 ; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))) {
                   lst.add(s.charAt(i));
            }
        }
        int j = lst.size()-1;
      
        for(int i = 0 ; i < s.length(); i++) {
            if(!Character.isLetter(s.charAt(i))) {
                empty = empty + s.charAt(i);
            } else {
                  if(j >= 0) {
                       empty = empty + lst.get(j);
                       j--;
                  }
            }
        }
        return empty;
    } 
}

//Given a string s, reverse the string according to the following rules:

//All the characters that are not English letters remain in the same position.
//All the English letters (lowercase or uppercase) should be reversed.
//Return s after reversing it.
               
               
        