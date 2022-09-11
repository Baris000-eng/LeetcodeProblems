class Solution {
    public double trimMean(int[] arr) {
       List<Integer> list = new ArrayList<Integer>();
       for(int i = 0 ; i < arr.length; i++) {
           list.add(arr[i]);
       }
       Collections.sort(list);
       int sum = 0, count = 0;
       for(int i = list.size()/20; i<= 19*list.size()/20-1; i++) {
           sum = sum + list.get(i);
           count++;
       }
        return ( (double) sum ) / count;
    }
}


/* Given an integer array arr, return the mean of the remaining integers after removing the smallest 5% and the largest 5% of the elements.

Answers within 10-5 of the actual answer will be considered accepted. */