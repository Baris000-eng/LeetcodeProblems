class Solution {
    public double average(int[] salary) {
        int min = salary[0], max = salary[0], sum = 0;
        for(int i = 0 ; i < salary.length; i++) {
            sum = sum + salary[i];
            if(salary[i]<=min) {
                min = salary[i];
            } 
            
            if(salary[i]>=max) {
                max = salary[i];
            }
        }
        
        sum = sum - (min + max);
        return (1.0 * sum) / (salary.length-2);
    }
}


//You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

//Return the average salary of employees excluding the minimum and maximum salary. Answers within 
//10-5 of the actual answer will be accepted.