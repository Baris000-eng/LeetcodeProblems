class Solution {
    public boolean isPerfectSquare(int num) {
        if(Math.sqrt(num)-Math.floor(Math.sqrt(num))==0) {
            return true;
        }
        return false;
    }
}
