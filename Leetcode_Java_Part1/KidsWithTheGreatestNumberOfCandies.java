class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>booleanList = new ArrayList<Boolean>();
        List<Integer>lst = Arrays.stream(candies).boxed().collect(Collectors.toList());
        for(int i = 0 ; i < lst.size(); i++) {
            lst.set(i,lst.get(i) + extraCandies);
            int max = Collections.max(lst);
            if(max == lst.get(i)) {
                booleanList.add(true);
            } else {
                booleanList.add(false);
            }
            lst.set(i,lst.get(i) - extraCandies);
        }
        
        
        return booleanList;
    }
}

/*There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.*/
