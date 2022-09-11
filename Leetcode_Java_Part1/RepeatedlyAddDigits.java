class Solution {
    public int addDigits(int num) {
        String str1 = String.valueOf(num);
        if(num <= 9) {
            return num;
        }
        int sum = 0;
        for(int i = 0 ; i < 10; i++) {
             while(num > 0) {
             sum = sum + num%10;
             num = num / 10;
             }
             int temp = num;
             num = sum;
             sum = temp;
             String str = String.valueOf(num);
             if(str.length() == 1) {
                 return num;
             }
        }
        
        return 0;
       
    }
}

//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.