class Solution {
  
/*You are given a 0-indexed m x n integer matrix grid. The width of a column is the maximum length of its integers.

For example, if grid = [[-10], [3], [12]], the width of the only column is 3 since -10 is of length 3.
Return an integer array ans of size n where ans[i] is the width of the ith column.

An integer x's length with len digits is equal to len if x is non-negative, and len + 1 otherwise.

Example 1:

Input: grid = [[1],[22],[333]]
Output: [3]
Explanation: In the 0th column, 333 is of length 3.
Example 2:

Input: grid = [[-15,1,3],[15,7,12],[5,6,-2]]
Output: [3,1,2]
Explanation: 
In the 0th column, only -15 is of length 3.
In the 1st column, all integers are of length 1. 
In the 2nd column, both 12 and -2 are of length 2.
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 100 
-109 <= grid[r][c] <= 109*/
    public int[] findColumnWidth(int[][] grid) {
        int[] arr = new int[grid[0].length];
        for (int j = 0; j < grid[0].length; j++) {
            int maxColumnWidth = 0;
            for (int i = 0; i < grid.length; i++) {
                int integerLength = findIntegerLength(grid[i][j]);
                if (integerLength >= maxColumnWidth) {
                    maxColumnWidth = integerLength;
                }
            }
            arr[j] = maxColumnWidth;
        }
        return arr;
    }

    public int findIntegerLength(int num) {
        int digitNum = findDigitNumber(Math.abs(num));
        if (num >= 0) {
            return digitNum;
        }
        return digitNum + 1;
    }

    public int findDigitNumber(int number) {
        if(number == 0) {
            return 1;
        }
        int digitNumber = 0;
        while (number > 0) {
            int remainder = number % 10;
            digitNumber++;
            number = number / 10;
        }
        return digitNumber;
    }
}
