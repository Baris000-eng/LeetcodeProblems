/*Given a positive integer num represented as a string, return the integer num without trailing zeros as a string.*/

class Solution {
    public String removeTrailingZeros(String num) {
        String result = num.replaceAll("(\\.\\d*?[1-9])?0+$", "$1");
        return result;
    }
}
