class Solution {
    public String reverseVowels(String s) {
        String empty = "";
        List<Character>lst = new ArrayList<Character>();
        for(int i = 0 ; i < s.length(); i++) {
            if(is_vowel(s.charAt(i))) {
                   lst.add(s.charAt(i));
            }
        }
        int j = lst.size()-1;
      
        for(int i = 0 ; i < s.length(); i++) {
            if(!is_vowel(s.charAt(i))) {
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
               
               
               
    public boolean is_vowel(char a) {
        if(a =='A'||a =='a'||a=='E'||a=='e'||a=='I'||a=='i'||a=='O'||a=='o'||a == 'U'||a=='u') {
            return true;
        }
        return false;
    }
}

//Given a string s, reverse only all the vowels in the string and return it.

//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.
               
               
        