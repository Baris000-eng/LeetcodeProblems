class Solution {
    public boolean isThree(int n) {
        int divisorCount = 0;
        for(int i = 1; i<=n; i++) {
            if(n%i==0) {
                divisorCount++;
            }
        }
        
        if(divisorCount == 3) {
            return true;
        }
        
           return false;
    }
}