class Solution {
    public String convertToBase7(int num) {
        int power = 0 , result = 0, digit = 0;
        while(num!=0) {
            digit = num%7;
            result = result+((int) Math.pow(10,power))*digit;
            power++;
            num = num/7;
        }
        return String.valueOf(result);
    }
}


//Given an integer num, return a string of its base 7 representation.