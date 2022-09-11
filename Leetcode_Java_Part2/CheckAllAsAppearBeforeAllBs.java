class Solution {
    public boolean checkString(String s) {
        boolean check = true;
        for(int i = 0 ; i < s.length(); i++) {
            for(int j = 0 ; j < s.length(); j++) {
                 if(s.charAt(i) == 'a' && s.charAt(j) == 'b'
                   && i > j) {
                     check = false;
                 }
            }
        }
        
        return check == true;
    }
}

/*Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.*/

