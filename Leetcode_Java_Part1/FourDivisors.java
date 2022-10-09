class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int j = 0 ; j < nums.length; j++) {
            if(divisorList(nums[j]).size() == 4) {
                sum = sum + listSum(divisorList(nums[j]));
            }
        }
        return sum;
    }
    
    
    public int listSum(List<Integer> list) {
        int s = 0;
        for(int k = 0 ; k < list.size(); k++) {
            s = s + list.get(k);
        }
        return s;
    }
    
    
    public List<Integer> divisorList(int num) {
        List<Integer> lst = new ArrayList<Integer>();
        for(int i = 1 ; i <= num; i++) {
            if(num % i == 0) {
                lst.add(i);
            }
        }
        return lst;
    }
}

/* Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors. If there is no such integer in the array, return 0. */


