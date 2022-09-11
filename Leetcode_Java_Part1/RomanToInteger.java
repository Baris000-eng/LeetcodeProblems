class Solution {
    public int romanToInt(String s) {
      int result = 0;
      s = s.replace("CD", "CCCC").replace("CM", "DCCCC").replace("XL", "XXXX").replace("XC", "LXXXX").replace("IV", "IIII").replace("IX", "VIIII");
      for(int i = 0;i< s.length();i++) {
        switch(s.charAt(i)) {
          case 'M':
            result+=1000;
            break;
          case 'V':
            result+=5;
            break;
          case 'I':
            result+=1;
            break;
          case 'X':
            result+=10;
            break;
          case 'D':
            result+=500;
            break;
          case 'C':
            result+=100;
            break;
          case 'L':
            result+=50;
            break;
        }
      }
        
        
        
        
        
        return result;
        
        
        
        
        
        
        
    }
}
