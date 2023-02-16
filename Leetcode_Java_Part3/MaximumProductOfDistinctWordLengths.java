class Solution {
    public int maxProduct(String[] words) {
        int lenProd = 0;
        for(int i = 0 ; i < words.length; i++) {
            for(int j = i+1 ; j < words.length; j++) {
                Set<Character> set1 = new HashSet<>();
                for (char c : words[i].toCharArray()) {
                    set1.add(c);
                }
                Set<Character> set2 = new HashSet<>();
                for (char c : words[j].toCharArray()) {
                    set2.add(c);
                }

                Set<Character> common = new HashSet<>(set1);
                common.retainAll(set2);
                int lenMult = words[i].length() * words[j].length();
                if(common.isEmpty()) {
                    if(lenMult >= lenProd) {
                        lenProd = lenMult;
                    }
                }

            }
        }


        return lenProd;
        
    }
}


/*Given a string array words, return the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. If no such two words exist, return 0.*/