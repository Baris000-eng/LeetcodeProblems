class Solution {
     public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> a : list) {
            temp.put(a.getKey(), a.getValue());
        }
        return temp;
    }
    
    public int[] topKFrequent(int[] nums, int k) {
        boolean[]arr = new boolean[nums.length];
        HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
        Arrays.fill(arr,false);
        for(int i = 0 ; i < nums.length; i++) {
            int count = 1;
            if(arr[i] == true) {
                continue;
            }
        for(int j = i + 1 ; j < nums.length; j++) {
            if(nums[j] == nums[i]) {
                count++;
                arr[j] = true;
            }
        }
            map.put(nums[i],count);
        }
        
        
        HashMap<Integer,Integer>resultMap = sortByValue(map);
        int amount = 0;
        List<Integer>lst = new ArrayList<Integer>();
        for(Integer i: resultMap.keySet()) {
            lst.add(i);
            amount++;
            if(amount == k) {
                break;
            }
        }
        
        return lst.stream().mapToInt(Integer::intValue).toArray();
    }
}




/* Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order. */

