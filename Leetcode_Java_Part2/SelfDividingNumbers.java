class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>selfDividingNums = new ArrayList<Integer>();
        for(int i = left; i <= right; i++) {
           if(is_self_dividing(i)) {
               selfDividingNums.add(i);
           }
        }
        
        return selfDividingNums;
    }
    
    
    
    
    public boolean is_self_dividing(int x) {
        boolean dividing = true;
        int a = x;
        while(x  > 0){
            int rem = x%10;
            if(rem == 0) {
                return false;
            } else {
                if(a%rem!=0) {
                dividing = false;
                }
            }
            x = x / 10;
        }
        
        
        return dividing == true;
    }
}

/*A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.

Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].*/








