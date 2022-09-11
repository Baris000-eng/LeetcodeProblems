class Solution {
    public boolean digitCount(String num) {
        boolean result = true;
        for(int i = 0 ; i < num.length(); i++) {
            int count = 0;
            for(int j = 0; j < num.length(); j++) {
                if(Integer.toString(i).contentEquals(Character.toString(num.charAt(j)))) {
                    count++;
                }
            }
            if(count!=Integer.parseInt(Character.toString(num.charAt(i)))) {
                result = false;
            }
          
        }
        
        return result;
    }
}

/*You are given a 0-indexed string num of length n consisting of digits.

Return true if for every index i in the range 0 <= i < n, the digit i occurs num[i] times in num, otherwise return false.*/
