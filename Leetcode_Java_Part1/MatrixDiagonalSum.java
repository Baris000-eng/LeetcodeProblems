class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length;
        int i = 0, j = 0;
        int diagonalSum = 0;
        for(i = 0 ; i < len; i++) {
                for(j = 0; j < len; j++) {
                    if(i==j||(i!=j&&i+j==len-1)) {
                        diagonalSum+=mat[i][j];
                    } 
            }
        }
        return diagonalSum;
      
    }
}


/*Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.*/


