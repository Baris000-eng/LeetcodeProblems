class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer>lst1 = new ArrayList<Integer>(); // create an array list for first half
        List<Integer>lst2 = new ArrayList<Integer>(); // create an array list for second half
        for(int i = 0 ; i < nums.length/2; i++) {  // fill the array for first half
            lst1.add(nums[i]);
        }

        for(int j = nums.length/2; j < nums.length; j++){ //fill the array for second half
            lst2.add(nums[j]);
        }

        List<Integer> lst = new ArrayList<Integer>();
        for(int i = 0 ; i < lst1.size(); i++) {
            // add each element of lst1 and lst2 index by index.
            lst.add(lst1.get(i)); 
            lst.add(lst2.get(i));
        }


        int[] array = new int[lst.size()]; // create an array of size lst.size()
        for(int i = 0; i < lst.size(); i++) {
            array[i] = lst.get(i); // fill the created array
        } 

        return array; // return that array
    }
}



//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

//Return the array in the form [x1,y1,x2,y2,...,xn,yn].

 

//Example 1:

//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7] 
//Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

//Example 2:

//Input: nums = [1,2,3,4,4,3,2,1], n = 4
//Output: [1,4,2,3,3,2,4,1]

//Example 3:

//Input: nums = [1,1,2,2], n = 2
//Output: [1,2,1,2]