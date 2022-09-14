class Solution {
    public String largestGoodInteger(String num) {
        List<Integer>goodIntegers = new ArrayList<Integer>();
        for(int i = 0 ; i < num.length(); i++) {
             String empty = "";
            if(i+1 <= num.length()-1 && i+2 <= num.length()-1) {
                if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2)) {
                    empty = empty + num.charAt(i) + num.charAt(i+1) + num.charAt(i+2);
                    goodIntegers.add(Integer.valueOf(empty));
                }
            }
        }
        
        List<Integer> distinctElements = goodIntegers.stream()
                                 .distinct()
                                 .collect(Collectors.toList());
        if(distinctElements.size()==1 && distinctElements.get(0) == 0) {
            return "000";
        } else if(distinctElements.size()==0) {
            return "";
        }
        
        return String.valueOf(Collections.max(distinctElements));
             
    }
}

/* You are given a string num representing a large integer. An integer is good if it meets the following conditions:

It is a substring of num with length 3.
It consists of only one unique digit.
Return the maximum good integer as a string or an empty string "" if no such integer exists.

Note:

A substring is a contiguous sequence of characters within a string.
There may be leading zeroes in num or a good integer. */