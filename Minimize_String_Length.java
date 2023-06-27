class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> charSet = new HashSet<Character>();
        for(int i = 0 ; i < s.length(); i++) {
            char ch = s.charAt(i);
            charSet.add(Character.valueOf(ch));
        }


        return charSet.size();

    }
}

/*Given a 0-indexed string s, repeatedly perform the following operation any number of times:

Choose an index i in the string, and let c be the character in position i. Delete the closest occurrence of 
  c to the left of i (if any) and the closest occurrence of c to the right of i (if any).
Your task is to minimize the length of s by performing the above operation any number of times.

Return an integer denoting the length of the minimized string.*/

 
