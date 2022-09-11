class Solution {
    public int findKthPositive(int[] arr, int k) {
       List<Integer> myList = Arrays.stream(arr).boxed().toList();
       List<Integer>lis = new ArrayList<Integer>();
       for(int i = 1; i<=arr[arr.length-1]; i++) {
           if(!myList.contains(i)) {
               lis.add(i);
           }
       }
        if(k<=lis.size()) {  
             return lis.get(k-1);
        }

       return k + arr[arr.length-1] - lis.size();
        
    }
}


/* Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array. */