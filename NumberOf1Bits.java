public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int numberOf1Bits = 0;
        String string = Integer.toBinaryString(n);
        for(int i = 0 ; i < string.length(); i++) {
            if(string.charAt(i) == '1') {
                numberOf1Bits++;
            }
        }

        return numberOf1Bits;
    }
}

/*Write a function that takes the binary representation of an 
  unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

Note:

Note that in some languages, such as Java, there is no unsigned integer type. In this case, 
the input will be given as a signed integer type. It should not affect your implementation, 
as the integer's internal binary representation is the same, whether it is signed or unsigned.
In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, 
the input represents the signed integer. -3.*/
