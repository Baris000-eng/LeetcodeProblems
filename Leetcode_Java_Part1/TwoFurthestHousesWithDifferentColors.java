class Solution {
    public int maxDistance(int[] colors) {
        int max = 0, i = 0, j = 0, len = colors.length;
        for(i = 0 ; i < len; i++) {
            for(j = i+1 ; j < len; j++) {
                if(colors[i]!=colors[j]) {
                   max = (int) Math.max(max,Math.abs(i-j));
                }
            }
        }
        return max;
    }
}

/*There are n houses evenly lined up on the street, and each house is beautifully painted. You are given a 0-indexed integer array colors of length n, where colors[i] represents the color of the ith house.

Return the maximum distance between two houses with different colors.

The distance between the ith and jth houses is abs(i - j), where abs(x) is the absolute value of x.*/

