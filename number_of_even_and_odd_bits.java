class Solution {
    public int[] evenOddBit(int n) {
        String binaryString = Integer.toBinaryString(n);
        int evenIndexNum = 0;
        int oddIndexNum = 0;
        for(int i = 0 ; i < binaryString.length(); i++) {
            if(binaryString.charAt(binaryString.length()-1-i) == '1') {
                if(i % 2 == 0) {
                    evenIndexNum++;
                } else {
                    oddIndexNum++;
                }
            }
        }


        int[]evenOddBitNumbers = new int[2];
        evenOddBitNumbers[0] = evenIndexNum;
        evenOddBitNumbers[1] = oddIndexNum;
        return evenOddBitNumbers;
    }




    public String convertIntegerToBinary(int myInt) {
            if (myInt == 0) {
                    return "0";
            }
    
            String binaryString = "";
    
            while (myInt > 0) {
                 int remainder = myInt % 2;
                 binaryString = remainder + binaryString;
                 myInt = myInt / 2;
            }
    
            return binaryString;
    }


}
