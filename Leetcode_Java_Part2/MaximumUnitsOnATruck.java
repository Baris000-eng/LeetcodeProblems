class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int length = boxTypes.length;
        int i = 0, sum = 0;
        Arrays.sort(boxTypes, (c,d) -> d[1]-c[1]);
        for(i = 0 ; i < length; i++) {
            int firstElement = boxTypes[i][0];
            if(firstElement<=truckSize){
                 truckSize = truckSize - boxTypes[i][0]; 
                 sum = sum + boxTypes[i][0] * boxTypes[i][1]; 
            } else {
                 sum = sum + truckSize * boxTypes[i][1];
                 break;
            }
        }
        
        return sum;
    }
}


/* You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:

numberOfBoxesi is the number of boxes of type i.
numberOfUnitsPerBoxi is the number of units in each box of the type i.
You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck. You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.

Return the maximum total number of units that can be put on the truck. */