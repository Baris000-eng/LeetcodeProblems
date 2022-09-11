class Solution {
    public boolean containsDuplicate(int[] nums) {
      List<Integer> lst = Arrays.stream(nums).boxed().collect(Collectors.toList());
      List<Integer> distinctElements = lst.stream()
                                 .distinct()
                                 .collect(Collectors.toList());
      return lst.size()!=distinctElements.size();
    }
}


/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.*/