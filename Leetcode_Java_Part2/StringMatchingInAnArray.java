class Solution {
    public List<String> stringMatching(String[] words) {
        List<String>lst = new ArrayList<String>();
        for(int i = 0 ; i < words.length; i++) {
            for(int j = 0; j < words.length; j++) {
                if(words[i].contains(words[j]) && !(words[j].contains(words[i]))){
                    lst.add(words[j]);
                }
            }
        }
        List<String> distinctStrings = lst.stream()
                                 .distinct()
                                 .collect(Collectors.toList());
        return distinctStrings;
    }
}


/*Given an array of string words. Return all strings in words which is substring of another word in any order. 

String words[i] is substring of words[j], if can be obtained removing some characters to left and/or right side of words[j].*/



