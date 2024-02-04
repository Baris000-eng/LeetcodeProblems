class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String str = "";
        for(int i = 0 ; i < words.size(); i++) {
            char first = words.get(i).charAt(0);
            str = str + String.valueOf(first);
        }

        if(str.equals(s)) {
            return true;
        }

        return false;
    }
}
