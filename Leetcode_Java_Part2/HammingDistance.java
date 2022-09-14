class Solution {
    public int hammingDistance(int x, int y) {
        String s1 = Integer.toBinaryString(x);
        String s2 = Integer.toBinaryString(y);
        while(s1.length()!=s2.length()) {
            if(s1.length() < s2.length()&& x < y) {
                s1 = "0" + s1;
            } else if(s2.length() < s1.length() && y < x) {
                s2 = "0" + s2;
            }
        }
        
        int positionCount = 0;
        
        for(int i = 0 ; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i)) {
              positionCount++;
            }
        }
        
        return positionCount;
       
    }
}


/* The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, return the Hamming distance between them. */