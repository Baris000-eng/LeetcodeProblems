class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int i = 0 ; i < arr1.length; i++)  {
            List<Boolean>lst = new ArrayList<Boolean>();
            for(int j = 0 ; j < arr2.length; j++) {
                if((int)Math.abs(arr1[i]-arr2[j]) > d) {
                    lst.add(true);
                }
            }
            if(lst.size() == arr2.length) {
                count++;
            }
        }
        
        return count;
    }
}

/*Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.

The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.*/