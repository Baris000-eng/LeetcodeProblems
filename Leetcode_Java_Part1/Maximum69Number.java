class Solution {
    public int maximum69Number (int num) {
        int max = 1;
        String string = String.valueOf(num);
        StringBuilder str = new StringBuilder(string);
        boolean yes9 = true;
        for(int i = 0 ; i < string.length(); i++) {
            if(string.charAt(i)!='9') {
                yes9 = false;
            }
        }
        
        if(yes9 == true)  {
            return num;
        }
     
        for(int i = 0 ; i < string.length(); i++) {
            if(string.charAt(i)=='9') {
                str.setCharAt(i, '6');
            } else if(string.charAt(i)=='6') {
                str.setCharAt(i, '9');
            }   
            String s = str.toString();
            System.out.println(s);
            int m = Integer.parseInt(s);
            if(m>=max) {
                max = m;
            }
            if(s.charAt(i) == '9') {
                str.setCharAt(i, '6');
            } else if(s.charAt(i) == '6') {
                str.setCharAt(i, '9');
            }
        }
       
        return max;
    }
}
/*You are given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).*/



