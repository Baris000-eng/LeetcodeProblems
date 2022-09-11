class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
       Arrays.sort(arr);
       List<Integer>lst = new ArrayList<Integer>();
       for(int i = 0 ; i < arr.length; i++) {
           if(i+1 <= arr.length - 1 ) {
               lst.add(arr[i+1]-arr[i]);
           }
       }
        List<Integer> distinctDifferences = lst.stream()
                                 .distinct()
                                 .collect(Collectors.toList());
        return distinctDifferences.size() == 1;
}
}


/*A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.

Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.*/

