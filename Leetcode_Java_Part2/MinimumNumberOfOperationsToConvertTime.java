class Solution {
    public int convertTime(String current, String correct) {
        String[]arr = current.split(":");
        String str1 = arr[0], str2 = arr[1];
        String stringPattern = "^0+(?!$)";
        str1 = str1.replaceAll(stringPattern, "");
        
        
        String[]arr2 = correct.split(":");
        String st1 = arr2[0], st2 = arr2[1];
        st1 = st1.replaceAll(stringPattern, "");
        
        int diff = 0;
        if(Integer.parseInt(st2) < Integer.parseInt(str2)) {
            diff = (Integer.parseInt(st2) + Integer.parseInt(str2)) + (Integer.parseInt(st1) - Integer.parseInt(str1)-1)*60;
        }
         diff = (Integer.parseInt(st2) - Integer.parseInt(str2)) + (Integer.parseInt(st1) - Integer.parseInt(str1))*60;
        int operationCount = 0;
        while(diff != 0) {
            operationCount++;
            if(diff>=60) {
                diff = diff - 60;
            } else if(diff>=15) {
                diff = diff - 15;
            } else if(diff>=5) {
                diff = diff - 5;
            } else if(diff>=1) {
                diff = diff -1;
            }
        }
        return operationCount;
       
        
        
    }
}

/*You are given two strings current and correct representing two 24-hour times.

24-hour times are formatted as "HH:MM", where HH is between 00 and 23, and MM is between 00 and 59. The earliest 24-hour time is 00:00, and the latest is 23:59.

In one operation you can increase the time current by 1, 5, 15, or 60 minutes. You can perform this operation any number of times.

Return the minimum number of operations needed to convert current to correct.*/




