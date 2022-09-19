class Solution {

/* Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n. */
    public int smallestEvenMultiple(int n) {  //my first solution
        return lcm(n,2);
    }
    
    public int smallestEvenMultipleSecondVersion(int n) { //my second solution
         if(n%2==0) {
         return n;
         }
         return 2 * n;
    }
    public int lcm(int num1 , int num2) {
        int i = num2;
        int j = num1;
        if(num2 > num1) {
            if(num2%num1==0){
                return num2;
            }
            while(true) {
               i++;
               if(i%num2 == 0 && i%num1 == 0) {
                   return i;
               }
           }
        } else if(num1 == num2) {
            return num1;
        } else {
             if(num1%num2 == 0) {
                 return num1;
             }
          while(true) {
               j++;
               if(j%num2 == 0 && j%num1 == 0) {
                   return j;
               }
           }
        }
    }
}
