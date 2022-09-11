class Solution {
    public int[] countBits(int n) {
        int[]ans=new int[n+1];
        for(int i = 0 ; i <= n; i++) {
            int count = 0;
            String binary = Integer.toBinaryString(i);
            for(int j = 0 ; j < binary.length(); j++) {
                if(binary.charAt(j) == '1') {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}

/*Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.*/

