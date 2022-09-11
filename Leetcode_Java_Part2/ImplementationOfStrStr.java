class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.contentEquals("")) {
            return 0;
        }
        if(1<= haystack.length() && needle.length()<=Math.pow(10,4)) {
             if(haystack.contains(needle)) {
                     return haystack.indexOf(needle);
             } else {
                 return -1;
             }
        }
        
        
        return -1;
    }
    
}
