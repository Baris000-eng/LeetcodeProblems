class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0) {
            return 0;
        } else if(s == null) {
            return 0;
        }
        s = s.replaceAll("\\s+$", ""); //remove all of the spaces at the end
        int last = s.lastIndexOf(" "); //get the index of the last space 
        int startOfLast = last + 1;
        int endOfLast = s.length();
        String lastWord = s.substring(startOfLast,endOfLast); //after the space, we can reach the last word
        return lastWord.length(); 
    }
}


