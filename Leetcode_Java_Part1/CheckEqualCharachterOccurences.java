class Solution {
    public boolean areOccurrencesEqual(String s) {
    boolean[]vis = new boolean[s.length()];
        Arrays.fill(vis,false);
        List<Integer>lst =  new ArrayList<Integer>();
        for(int i = 0; i < s.length(); i++){
int c = 1;
if(vis[i]==true){
   continue;
}
for(int j = 0; j < s.length(); j++){
    if(s.charAt(i) == s.charAt(j)&& i!=j){
    c++;
    vis[j] = true;
}
}
            lst.add(c);
}
        
        
    List<Integer>list = lst.stream().distinct().collect(Collectors.toList());
        
        
        return list.size()==1;
    }
}

/*Given a string s, return true if s is a good string, or false otherwise.

A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).*/





