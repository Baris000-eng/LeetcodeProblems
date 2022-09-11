class Solution {
    public int percentageLetter(String s, char letter) {
        int len = s.length();
        int letterCount = 0;
        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == letter) {
                letterCount++;
            }
        }
        
        double percentage = ((double)letterCount / s.length()) * 100;
        int result = (int) percentage;
        return result;
        
    }
}
    

    
    
    
//Given a string s and a character letter, return the percentage of characters in s that equal letter 
//rounded down to the nearest whole percent.