class Solution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        List<Integer> list = new ArrayList<Integer>();
        for(int j = 0 ; j < arr.length; j++) {
            list.add(arr[j]);
        }
        for(int i = 0 ; i < list.size(); i++) {
            list.set(i,Integer.MIN_VALUE);
            if(i == list.size() - 1) {
                list.set(i,-1);
            }
            result[i] = Collections.max(list);
        }
        return result;
    }
}

/* Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array. */



