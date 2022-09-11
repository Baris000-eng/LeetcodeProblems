class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num < 0) {
            return 0;
        }
        String firstStr = String.valueOf(num); //converting num to its String version
        String regex1 = "^0+(?!$)";
        firstStr = firstStr.replaceAll(regex1, ""); //removing leading zeros
        String empty="";
        for(int i = firstStr.length()-1 ; i >= 0; i--) { //first reversal
            empty = empty + firstStr.charAt(i);
        }
        String regex2 = "^0+(?!$)"; 
        empty = empty.replaceAll(regex2, ""); //removing leading zeros
        String result = "";
        for(int i = empty.length()-1 ; i >= 0; i--) { //second reversal
            result = result + empty.charAt(i);
        }
        String regex3 = "^0+(?!$)";
        result = result.replaceAll(regex3, ""); //removing leading zeros


        if(result.contentEquals(firstStr)) { //if the content of the result string is equal to firstStr , then return true.
            return true;
        }

        return false; //Otherwise, return false
    }
}


        // Reversing an integer means to reverse all its digits.

        // For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not retained.
        // Given an integer num, reverse num to get reversed1, then reverse reversed1 to get reversed2. Return true if reversed2 equals num. Otherwise return false.