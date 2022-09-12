class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        int targetIndex = str.indexOf(target);
        int length = letters.length, j = 0, count = 0;
        char ch = ' ';
        for(j = 0 ; j < length; j++) {
            if(str.indexOf(letters[j])>targetIndex) {
                targetIndex = str.indexOf(letters[j]);
                ch = letters[j];
                count++;
                if(count == 1) {
                    break;
                }
            } else if(targetIndex >= str.indexOf(letters[letters.length-1])) {
                ch = letters[0];
            } 
        }
        return ch;    
    }
}

/* Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.

Note that the letters wrap around.

For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'. */