import java.util.HashMap;
/*An integer x is numerically balanced if for every digit d in the number x, there are exactly d occurrences of that digit in x.

Given an integer n, return the smallest numerically balanced number strictly greater than n.

 

Example 1:

Input: n = 1
Output: 22
Explanation: 
22 is numerically balanced since:
- The digit 2 occurs 2 times. 
It is also the smallest numerically balanced number strictly greater than 1.
Example 2:

Input: n = 1000
Output: 1333
Explanation: 
1333 is numerically balanced since:
- The digit 1 occurs 1 time.
- The digit 3 occurs 3 times. 
It is also the smallest numerically balanced number strictly greater than 1000.
Note that 1022 cannot be the answer because 0 appeared more than 0 times.
Example 3:

Input: n = 3000
Output: 3133
Explanation: 
3133 is numerically balanced since:
- The digit 1 occurs 1 time.
- The digit 3 occurs 3 times.
It is also the smallest numerically balanced number strictly greater than 3000.
 

Constraints:

0 <= n <= 106*/
public class Solution {
    public int nextBeautifulNumber(int n) {
        int i = n + 1; 
        while (true) {
            if (isNumericallyBalanced(i)) {
                return i;
            }
            i++;
        }
    }

    public boolean isNumericallyBalanced(int num) {
        HashMap<Integer, Integer> hMap = findDigitOccurrenceAmountMap(num);
        for (int key : hMap.keySet()) {
            if (key != hMap.get(key)) {
                return false; 
            }
        }
        return true;
    }

    public HashMap<Integer, Integer> findDigitOccurrenceAmountMap(int number) {
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        while (number > 0) {
            int remainder = number % 10;
            int frequency = hMap.getOrDefault(remainder, 0) + 1;
            hMap.put(remainder, frequency);
            number = number / 10;
        }
        return hMap;
    }
}
