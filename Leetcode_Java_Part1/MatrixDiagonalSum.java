class Solution {
    public boolean checkXMatrix(int[][] grid) {
        boolean checkX = true;
        for(int i = 0 ; i < grid.length; i++) {
            for(int j = 0; j < grid.length; j++) {
                if(i==j && grid[i][j]==0) {
                    checkX = false;
                } else if(i+j==grid.length-1 && grid[i][j]==0) {
                     checkX = false;
                } else if(i!=j&&i+j!=grid.length-1&&grid[i][j]!=0) {
                     checkX = false;
                }
            }
        }
        
        
        return checkX;
    }
}


/*A square matrix is said to be an X-Matrix if both of the following conditions hold:

All the elements in the diagonals of the matrix are non-zero.
All other elements are 0.
Given a 2D integer array grid of size n x n representing a square matrix, return true if grid is an X-Matrix. Otherwise, return false.*/


