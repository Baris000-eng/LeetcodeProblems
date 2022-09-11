import java.math.*;
class Solution {
    public int[] plusOne(int[] digits) {
        boolean is9 = true;
        for(int i = 0 ; i < digits.length; i++) {
            if(digits[i]!= 9) {
                is9 = false;
            }
        }
        

            String empty = "";
            for(int i = 0 ; i < digits.length; i++) {
                empty = empty + String.valueOf(digits[i]);
            }
            
            BigInteger emp = new BigInteger(empty);
            BigInteger one = new BigInteger("1");
            BigInteger sum = emp.add(one);
            String res = String.valueOf(sum);
            int[]array = {};
            if(is9 == true) {
                 array = new int[digits.length+1];
            } else {
                array = new int[digits.length];
            }
           
            for(int i = 0 ; i < res.length(); i++) {
                array[i] = Integer.parseInt(Character.toString(res.charAt(i)));
            }
        
                return array;
            
            
        }
    }

