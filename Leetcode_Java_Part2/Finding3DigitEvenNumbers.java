import java.math.*;
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer>intList = new ArrayList<Integer>();
        for(int i = 0 ; i < digits.length; i++) {
            for(int j = 0 ; j < digits.length; j++) {
               for(int k = 0 ; k < digits.length; k++) {
                    String val = "";
                   if(digits[i]!=0 && digits[k]%2==0 && i!=j && j!=k && i!=k) {
                       if(val.length()!=3 && digits[i]!=0 && digits[k]%2==0) {
                       val = val + digits[i] + digits[j] + digits[k];
                       }
                       intList.add(Integer.parseInt(val));
                   }
               }
            }
            
        }
        
        
        int[] result = intList.stream().distinct().mapToInt(Integer::intValue).toArray();
        
        Arrays.sort(result);
        return result;
    }
}


/*You are given an integer array digits, where each element is a digit. The array may contain duplicates.

You need to find all the unique integers that follow the given requirements:

The integer consists of the concatenation of three elements from digits in any arbitrary order.
The integer does not have leading zeros.
The integer is even.
For example, if the given digits were [1, 2, 3], integers 132 and 312 follow the requirements.

Return a sorted array of the unique integers.*/