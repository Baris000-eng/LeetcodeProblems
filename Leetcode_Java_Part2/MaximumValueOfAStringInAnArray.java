class Solution {
    public int maximumValue(String[] strs) {
        int length = strs.length;
        int maximumVal = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            boolean isNumeric = true;
            for (int j = 0; j < strs[i].length(); j++) {
                if (!Character.isDigit(strs[i].charAt(j))) {
                    isNumeric = false;
                    break;
                }
            }
            if(isNumeric == false) {
                int len_val = strs[i].length();
                if (len_val > maximumVal) {
                    maximumVal = len_val;
                }
            } else {
                String res = strs[i].replaceAll("^0*", "");
                if (res.isEmpty()) {
                    res = "0";
                }
                int result = Integer.valueOf(res);
                if (result > maximumVal) {
                    maximumVal = result;
                }
            }
        }
        return maximumVal;
    }
}

//The value of an alphanumeric string can be defined as:

//The numeric representation of the string in base 10, if it comprises of digits only.
//The length of the string, otherwise.
//Given an array strs of alphanumeric strings, return the maximum value of any string in strs.

 

//Example 1:

////Input: strs = ["alic3","bob","3","4","00000"]
//Output: 5
//Explanation: 
//- "alic3" consists of both letters and digits, so its value is its length, i.e. 5.
//- "bob" consists only of letters, so its value is also its length, i.e. 3.
//- "3" consists only of digits, so its value is its numeric equivalent, i.e. 3.
//- "4" also consists only of digits, so its value is 4.
//- "00000" consists only of digits, so its value is 0.
//Hence, the maximum value is 5, of "alic3".
//Example 2:

//Input: strs = ["1","01","001","0001"]
//Output: 1
//Explanation: 
//Each string in the array has value 1. Hence, we return 1.
 

//Constraints:

//1 <= strs.length <= 100
//1 <= strs[i].length <= 9
//strs[i] consists of only lowercase English letters and digits.


