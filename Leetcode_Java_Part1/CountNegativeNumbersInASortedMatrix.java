class Solution {
    public int countNegatives(int[][] grid) {
        int negativeNumberCount = 0;
        for(int i = 0 ; i < grid.length; i++) {
            for(int j = 0 ; j < grid[i].length; j++) {
                int num = grid[i][j];
                if(num < 0) {
                    negativeNumberCount++;
                }
            }
        }
        return negativeNumberCount;
    }
}

/*Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.*/