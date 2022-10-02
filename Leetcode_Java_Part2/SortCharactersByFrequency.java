class Solution {
    public static HashMap<Character, Integer> sortByValue(HashMap<Character, Integer> hashMap)
    {
        List<Map.Entry<Character, Integer> > list =
               new LinkedList<Map.Entry<Character, Integer> >(hashMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> b : list) {
            temp.put(b.getKey(), b.getValue());
        }
        return temp;
    }
    
    public String frequencySort(String s) {
        boolean[]arr = new boolean[s.length()];
        Arrays.fill(arr,false);
        HashMap<Character,Integer>map = new HashMap<Character,Integer>();
        for(int i = 0 ; i < s.length(); i++) {
            int count = 1;
            if(arr[i] == true) {
                continue;
            }
            for(int j = i + 1 ; j < s.length(); j++) {
                if(s.charAt(j)==s.charAt(i)) {
                    count++;
                    arr[j] = true;
                }
            }
            map.put(s.charAt(i),count);
        }
        
        HashMap<Character,Integer>orderedHashMap = sortByValue(map);
        String res = "";
        for(Character ch: orderedHashMap.keySet()) {
            for(int i = 0 ; i < orderedHashMap.get(ch); i++) {
                 res = res + ch;
            }
        }
        
        return res;
    }
}


/* Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them. */