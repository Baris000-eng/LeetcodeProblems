class Solution {
   
   
    public boolean isHappy(int n) {
        int sum = 0;
        for(int i = 0 ; i < 30; i++) {
            while(n>0) {
                int remainderSquare = (n%10)*(n%10); //get the square of remainder
                sum = sum + remainderSquare; //add remainder to sum
                n = n / 10; //go to one left digit of the number
            }
            int temp = n; //swap n with sum
            n = sum;
            sum = temp;
            if(n == 1) { //if n is 1, than return true
                return true;
            }
        }


        return false;
    }
    
    
    
  
    
}