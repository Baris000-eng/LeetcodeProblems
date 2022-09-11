class Solution {
    public boolean isPowerOfThree(int n) {
       if(n<1) {
           return false;
       } else if(n==1) {
           return true;
       }
      while (n > 1) {
        if (n%3 == 1 || n%3 == 2) {
            return false;
        }
        n = n/3;
    }
        
        return true; 
   }
    
}

