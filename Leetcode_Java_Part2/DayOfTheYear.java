class Solution {
    public int dayOfYear(String date) {
        String[]myArray = date.split("-");
        int day = 0;
        String stringPattern = "^0+(?!$)";
        int[]days = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        String myFirstString = myArray[0];
        String mySecondString = myArray[1];
        String myThirdString = myArray[2];
        
        myFirstString = myFirstString.replaceAll(stringPattern, ""); //for removing leading zeros
        mySecondString = mySecondString.replaceAll(stringPattern, ""); //for removing leading zeros
        myThirdString = myThirdString.replaceAll(stringPattern, ""); //for removing leading zeros
        
        int myFirstInt = Integer.valueOf(myFirstString);
        int mySecondInt = Integer.valueOf(mySecondString);
        int myThirdInt = Integer.valueOf(myThirdString);
        
        if(isLeapYear(myFirstInt) == true) {
            days[1] = 29;
        }
        for(int j = 0 ; j < mySecondInt - 1; j++) {
            day = day + days[j];
        }
    
        day = day + myThirdInt;
        return day;
    }
    
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } 
            return true;
    }

/*Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.*/


    
    
    
   
}