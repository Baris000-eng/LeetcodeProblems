class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean hasAlternating = true;
        String str = Integer.toBinaryString(n);
        for(int i = 0 ; i < str.length(); i++) {
            if(i+1 <= str.length()-1) {
                if(str.charAt(i+1)==str.charAt(i)) {
                    hasAlternating = false;
                }
            }
        }
        return hasAlternating;
    }
}


/*Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.*/
