class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int busyStudentCount = 0;
        for(int i = 0 ; i < startTime.length; i++) {
            if(startTime[i]<=queryTime && queryTime<=endTime[i]){
                busyStudentCount++;
            }
        }
        
        
        return busyStudentCount;
    }
}


/*Given two integer arrays startTime and endTime and given an integer queryTime.

The ith student started doing their homework at the time startTime[i] and finished it at time endTime[i].

Return the number of students doing their homework at time queryTime. More formally, return the number of students where queryTime lays in the interval [startTime[i], endTime[i]] inclusive.*/