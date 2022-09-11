class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        List<Integer>lst = new ArrayList<Integer>();
        for(int i = lowLimit; i<=highLimit; i++) {
            lst.add(getDigitSum(i));
        }
       
        boolean[]arr = new boolean[lst.size()];
        Arrays.fill(arr,false);
        List<Integer>frequencies = new ArrayList<Integer>();
        for(int i = 0 ; i < lst.size(); i++) {
            int count = 1;
            if(arr[i] == true) {
                continue;
            }
            for(int j = i + 1 ; j < lst.size(); j++) {
                if(lst.get(j)==lst.get(i)){
                    count++;
                    arr[j] = true;
                }
            }
            frequencies.add(count);
        }
        
        return Collections.max(frequencies);
    }
    
    
    
    
    public int getDigitSum(int num) {
        int sum = 0;
        while(num > 0) {
            int remainder = num % 10;
            sum = sum + remainder;
            num = num / 10;
        }
        return sum;
    }
}



/*You are working in a ball factory where you have n balls numbered from lowLimit up to highLimit inclusive (i.e., n == highLimit - lowLimit + 1), and an infinite number of boxes numbered from 1 to infinity.

Your job at this factory is to put each ball in the box with a number equal to the sum of digits of the ball's number. For example, the ball number 321 will be put in the box number 3 + 2 + 1 = 6 and the ball number 10 will be put in the box number 1 + 0 = 1.

Given two integers lowLimit and highLimit, return the number of balls in the box with the most balls.*/