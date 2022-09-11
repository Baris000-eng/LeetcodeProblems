class Solution {
    public int secondHighest(String s) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        List<Integer> lst = new ArrayList<Integer>();
        for(int i = 0 ; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                String str = Character.toString(s.charAt(i));
                lst.add(Integer.parseInt(str)); //add the digits in the string to a list.
            } 
        }
        List<Integer> distinctInts = lst.stream() //obtaining unique digits.
                                 .distinct()
                                 .collect(Collectors.toList());
        if(distinctInts.size() <= 1) { 
            return -1; 
        } 
            max = Collections.max(distinctInts); //find the initial max
            index = distinctInts.indexOf(max); //find the index of initial max
            distinctInts.set(index,Integer.MIN_VALUE); //set the initial max to Integer.MIN_VALUE
            max = Collections.max(distinctInts); //find second max
            return max; //return second max
        
    }
}

