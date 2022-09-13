class Solution {
    public int countPrimeSetBits(int left, int right) {
        int numsWithPrimeNumberOfBits = 0;
        for(int i = left; i<=right; i++) {
            String string = Integer.toBinaryString(i);
            int count = 0;
            for(int j = 0 ; j < string.length(); j++) {
                if(string.charAt(j)=='1') {
                    count++;
                }
            }
            
            if(isPrime(count)) {
                numsWithPrimeNumberOfBits++;
            }
        }
        
        return numsWithPrimeNumberOfBits;
    }
    
    
    
     public boolean isPrime(int n) {
         if(n<=1) {
             return false;
         }
         
         boolean prime = true;
         for(int j = 2 ; j <= Math.sqrt(n); j++) {
             if(n%j==0) {
                 prime = false;
             }
         }
         return prime;
     }
    
    
    
    
    
}

/* Given two integers left and right, return the count of numbers in the inclusive range [left, right] having a prime number of set bits in their binary representation.

Recall that the number of set bits an integer has is the number of 1's present when written in binary.

For example, 21 written in binary is 10101, which has 3 set bits. */




