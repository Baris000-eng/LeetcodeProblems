class Solution {
    public String[] findOcurrences(String text, String first, String second) {
       List<String>thirdStrings = new ArrayList<String>();
       String[]array = text.split(" ");
       for(int i = 0 ; i < array.length; i++) {
         if(i+1 <= array.length-1 && i+2 <= array.length-1) {
           if(array[i].contentEquals(first)&&array[i+1].contentEquals(second)) {
               thirdStrings.add(array[i+2]);
           }
       }
    }
        
       String[] result = thirdStrings.toArray(String[]::new);
       return result;
        
    
  }
}

/* Given two strings first and second, consider occurrences in some text of the form "first second third", where second comes immediately after first, and third comes immediately after second.

Return an array of all the words third for each occurrence of "first second third". */