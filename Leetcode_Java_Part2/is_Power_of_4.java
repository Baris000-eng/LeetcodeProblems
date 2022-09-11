class Solution {
    public boolean isPowerOfFour(int n) {
       if(n<1) {
           return false;
       } else if(n==1) {
           return true;
       }
      while (n > 1) {
        if (n%4 == 1 || n%4 == 2 || n%4 == 3) {
            return false;
        }
        n = n/4;
    }
        
        return true; 
   }
    
}

