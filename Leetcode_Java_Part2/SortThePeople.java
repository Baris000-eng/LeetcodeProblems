class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        return 
        IntStream.range(0, names.length)
        .boxed()
        .sorted((name1, name2) -> heights[name2] - heights[name1])
        .map(id -> names[id])
        .toList()
        .toArray(new String[0]);
    }
}

//You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

//For each index i, names[i] and heights[i] denote the name and height of the ith person.

//Return names sorted in descending order by the people's heights.

