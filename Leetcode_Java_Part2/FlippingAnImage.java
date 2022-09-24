class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][]res = new int[image.length][image[0].length];
        for(int i = 0 ; i < image.length; i++) {
            for(int j = 0; j < image[0].length; j++) {
                res[i][j] = image[i][image[0].length-1-j];
                if(res[i][j] == 0) {
                    res[i][j] = 1;
                } else if(res[i][j] == 1) {
                    res[i][j] = 0;
                }
            }
        }
        
        return res;
    }
}

/* Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0]. */
