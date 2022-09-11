class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        List<Integer>lst = new ArrayList<Integer>();
        int len = arr.length;
        boolean isVisited[] = new boolean[len];
        Arrays.fill(isVisited, false);
        for(int i = 0 ; i < len; i++) {
           int count = 1;
           if(isVisited[i] == true) {
               continue;
           }
           for(int j = 0; j < len; j++) {
               if(arr[i]==arr[j] && i!=j) {
                  isVisited[j] = true;
                   count++;
               }
           }
                 lst.add(count);
         }
        
        List<Integer> distinctInts = lst.stream()
                                 .distinct()
                                 .collect(Collectors.toList());
        
        
        return distinctInts.size() == lst.size();
     }
}

/*Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise*/



