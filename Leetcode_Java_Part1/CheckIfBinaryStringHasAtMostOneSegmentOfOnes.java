class Solution {
    public boolean checkOnesSegment(String s) {
        int length = s.length(), i = 0;
        for(i=0; i < length; i++) {
            if(i+1 <= length - 1) {
                if(s.charAt(i)=='0' && s.charAt(i+1)=='1') {
                    return false;
                }
            }
        }
        return true;
    }
}

/* Given a binary string s ​​​​​without leading zeros, return true​​​ if s contains at most one contiguous segment of ones. Otherwise, return false. */