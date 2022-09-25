class Solution {
    public boolean isBoomerang(int[][] points) {
        boolean isEqual = false;
        for(int i = 0 ; i < points.length; i++) {
            for(int j = i + 1 ; j < points.length; j++) {
                if(Arrays.equals(points[i],points[j])) {
                    isEqual = true;
                }
            }
        }
        return !isEqual && !checkStraightLine(points);
    }
    
/* Given an array points where points[i] = [xi, yi] represents a point on the X-Y plane, return true if these points are a boomerang.

A boomerang is a set of three points that are all distinct and not in a straight line. */
    
    public boolean checkStraightLine(int[][] coordinates) {
        List<Double>lst = new ArrayList<Double>();
        boolean equalX = true, equalY = true;
        for(int i = 0 ; i < coordinates.length; i++) {
            for(int j = 0 ; j < 2; j++) {
                if(i+1<=coordinates.length-1 && j+1 <=1) {
                    int x1 = coordinates[i][j];
                    int y1 = coordinates[i][j+1];
                    int x2 = coordinates[i+1][j];
                    int y2 = coordinates[i+1][j+1];
                    if(y1 != y2) {
                        equalY = false;
                    } 
                    
                    if(x1 != x2) {
                        equalX = false;
                    }
                    
                    if(x1 == x2) { //handling undefined cases
                        if(y1 < y2) { //if y2-y1 > 0
                            lst.add(Double.POSITIVE_INFINITY); //add positive infinity as slope to list
                        } else if(y2 < y1) { //if y2 - y1 < 0
                            lst.add(Double.NEGATIVE_INFINITY); //add negative infinity as slope to list
                        }
                    } else { //otherwise
                        if(y1 == y2) { //if y1 == y2 
                             lst.add(0.0); // add 0 as slope to list
                        } else { // if y1!=y2
                            lst.add( (1.0 * (y2-y1)/(x2-x1))); //convert slope to Double and add it to list
                        }
                    }
                }
            }
        }
         List<Double> distinctDoubles = lst.stream()
                                 .distinct()
                                 .collect(Collectors.toList());
        
         if(equalX == true||equalY == true||distinctDoubles.size() == 1) {
                    return true;
         } else if(distinctDoubles.size() != lst.size()) {
                    return false;
         } 
        
                return false;
        }
}