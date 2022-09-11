class Solution {
    public int findLucky(int[] arr) {
        boolean luckyNumber = false;
        int len = arr.length;
        boolean[]vis = new boolean[len];
        Arrays.fill(vis,false);
        List<Integer>lst = new ArrayList<Integer>();
        for(int i = 0 ; i < arr.length; i++) {
            int count = 1;
            if(vis[i] == true) {
                continue;
            }
            for(int j = i + 1 ; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    vis[j] = true;
                    count++;
                }
            }
            if(count == arr[i]) {
                luckyNumber = true;
                lst.add(count);
            }
        }
        
        if(luckyNumber == false) {
            return -1;
        }
        
        
        
        return Collections.max(lst);
    }
}



/*Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.

Return the largest lucky integer in the array. If there is no lucky integer return -1.*/

