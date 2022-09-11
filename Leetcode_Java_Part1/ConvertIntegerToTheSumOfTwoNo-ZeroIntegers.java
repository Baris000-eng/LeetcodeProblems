class Solution {
    public int[] getNoZeroIntegers(int n) {
        List<Integer>lst = new ArrayList<Integer>();
        for(int i = 1; i<=n; i++) {
           String str = String.valueOf(i);
            for(int j = 1; j<=n; j++) {
                 String str2 = String.valueOf(j);
                if(i+j==n && !str.contains("0") && !str2.contains("0")
                  ) {
                   lst.add(i);
                   lst.add(j);
                }
            }
           if(lst.size() == 2) {
               break;
           }
        }
        
        int[] result = lst.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
        
        
        return result;
    }
}

/* No-Zero integer is a positive integer that does not contain any 0 in its decimal representation.

Given an integer n, return a list of two integers [A, B] where:

A and B are No-Zero integers.
A + B = n
The test cases are generated so that there is at least one valid solution. If there are many valid solutions you can return any of them. */