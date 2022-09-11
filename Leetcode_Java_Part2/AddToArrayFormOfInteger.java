import java.math.*;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String empty = "";
        List<Integer>myList = new ArrayList<Integer>();
        for(int i = 0 ; i < num.length; i++) {
            empty+=num[i];
        }
        BigInteger myInt = new BigInteger(empty);
        BigInteger kInt = BigInteger.valueOf(k);
        BigInteger res = myInt.add(kInt);
        for(int j = 0 ; j < String.valueOf(res).length(); j++) {
                myList.add(Integer.parseInt(Character.toString(result.charAt(j))));
        }
        
        return myList;
    }
}


/*The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.*/