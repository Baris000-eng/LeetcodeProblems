class Solution {
    public boolean areNumbersAscending(String s) {
        List<Integer>lst = new ArrayList<Integer>();
        String[]arr = s.split(" ");
        for(int i = 0 ; i < arr.length; i++) {
                if(isNumeric(arr[i])) {
                Integer integer = Integer.parseInt(arr[i]);
                lst.add(integer);
                }
        }
        boolean is_ascending = true;
        for(int j = 0 ; j < lst.size(); j++) {
            if(j+1 <= lst.size() -1) {
                 if(lst.get(j+1) <= lst.get(j)) {
                    is_ascending = false;
                 }
            }
        }
        return is_ascending == true;
    }

public static boolean isNumeric(String strNum) {
    try {
        int k = Integer.parseInt(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
}






/*A sentence is a list of tokens separated by a single space with no leading or trailing spaces. Every token is either a positive number consisting of digits 0-9 with no leading zeros, or a word consisting of lowercase English letters.

For example, "a puppy has 2 eyes 4 legs" is a sentence with seven tokens: "2" and "4" are numbers and the other tokens such as "puppy" are words.
Given a string s representing a sentence, you need to check if all the numbers in s are strictly increasing from left to right (i.e., other than the last number, each number is strictly smaller than the number on its right in s).

Return true if so, or false otherwise.*/

