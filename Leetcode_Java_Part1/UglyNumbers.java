class Solution {
    public boolean isUgly(int n) {
        while(n>1)  {
            if(n%5 == 0)  { //if the number n is divisble by 5
                n = n / 5; //divide the number by 5
            } else if(n%3 == 0) { //if the number n is divisible by 3
                n = n / 3; //divide the number by 3
            } else if(n%2 == 0) { //if the number n is divisible by 2
                n = n / 2; //divide the number by 2
            } else  { //if the number cannot be divisible by 2, 3, or 5
                return false; //return false
            }
        }
        
        if(n == 1) { //if we reach 1 
            return true; //return true
        }
        return false; //Otherwise, return false
    }


//An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

//Given an integer n, return true if n is an ugly number.
            
    

    
    
    
}