class Solution {
    public double calculateTax(int[][] brackets, int income) {
        if(income < 0) { //edge & imaginary cases
            return 0.0;
        }
        double totalTax = 0.0;
        int previous = 0, len = brackets.length, i = 0;
        for(i = 0; i < len; i++) {
            if(brackets[i][0] >= income) {
                 totalTax = totalTax + (income - previous) * brackets[i][1] / 100.0;
                 break;
            } else {
                 totalTax = totalTax + (brackets[i][0] - previous) * brackets[i][1] / 100.0;
                 previous = brackets[i][0];
            }
        }
        return totalTax;
   }
}

/*You are given a 0-indexed 2D integer array brackets where brackets[i] = [upperi, percenti] means that the ith tax bracket has an upper bound of upperi and is taxed at a rate of percenti. The brackets are sorted by upper bound (i.e. upperi-1 < upperi for 0 < i < brackets.length).

Tax is calculated as follows:

The first upper0 dollars earned are taxed at a rate of percent0.
The next upper1 - upper0 dollars earned are taxed at a rate of percent1.
The next upper2 - upper1 dollars earned are taxed at a rate of percent2.
And so on.
You are given an integer income representing the amount of money you earned. Return the amount of money that you have to pay in taxes. Answers within 10-5 of the actual answer will be accepted.*/