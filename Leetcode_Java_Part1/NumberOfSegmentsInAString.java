class Solution {
    public int countSegments(String s) {
        if(s.isEmpty() || s.isBlank()){
            return 0;
        }
        return s.trim().split("\\s+").length;
    }
}


//Given a string s, return the number of segments in the string.

//A segment is defined to be a contiguous sequence of non-space characters.