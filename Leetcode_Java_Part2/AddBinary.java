import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger firstNum = new BigInteger(a, 2);
        BigInteger secondNum = new BigInteger(b, 2);
        BigInteger sum = firstNum.add(secondNum);
        String result = sum.toString(2); //big integer to string with radix specified to 2.
        return result;
    }
}

/* Given two binary strings a and b, return their sum as a binary string. */