class Solution {
    public int bitwiseComplement(int n) {
        String string = Integer.toBinaryString(n);
        String complement = "";
        for(int i = 0 ; i < string.length(); i++) {
            if(string.charAt(i)=='1') {
                complement = complement + '0';
            } else if(string.charAt(i)=='0') {
                complement = complement + '1';
            }
        }
        int sum = 0;
        for(int i = complement.length()-1; i>=0; i--) {
            int coefficient = Integer.parseInt(Character.toString(complement.charAt(i)));
            int power = (int) Math.pow(2,complement.length()-1-i);
            sum = sum + coefficient * power;
        }
        
        return sum;
    }
}


/*The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer n, return its complement.*/
