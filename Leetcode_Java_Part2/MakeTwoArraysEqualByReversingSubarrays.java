class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        List<Integer>targetList = new ArrayList<Integer>();
        List<Integer>arrList = new ArrayList<Integer>();
        
        for(int i = 0 ; i < target.length; i++) {
            targetList.add(target[i]);
        }
        
         for(int j = 0 ; j < arr.length; j++) {
            arrList.add(arr[j]);
        }
        
        Collections.sort(targetList);
        Collections.sort(arrList);
        return targetList.equals(arrList);
        
    }
}


/* You are given two integer arrays of equal length target and arr. In one step, you can select any non-empty sub-array of arr and reverse it. You are allowed to make any number of steps.

Return true if you can make arr equal to target or false otherwise. */