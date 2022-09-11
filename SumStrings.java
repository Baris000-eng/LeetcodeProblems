import java.math.*;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger bigInt1 = new BigInteger(num1);
        BigInteger bigInt2 = new BigInteger(num2);
        BigInteger result = bigInt1.add(bigInt2);
        return ""+result;
    }
}


/* Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly. */

