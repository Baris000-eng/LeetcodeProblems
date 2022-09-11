class Solution {
    public int countTriples(int n) {
       int count = 0;
       for(int a = 1; a<=n; a++) {
           for(int b = 1; b<=n; b++) {
               for(int c = 1; c<=n; c++) {
                   if(c*c==a*a+b*b && c>a && c>b && a+c>b && a+b>c && b+c>a
                     && a>0 && b>0 && c>0) {
                       count++;
                   }
               }
           }
       }
        
        return count;
        
    }
}


/*A square triple (a,b,c) is a triple where a, b, and c are integers and a2 + b2 = c2.

Given an integer n, return the number of square triples such that 1 <= a, b, c <= n.*/
