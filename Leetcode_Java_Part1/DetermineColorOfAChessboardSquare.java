class Solution {
    public boolean squareIsWhite(String coordinates) {
       if(
           
           ( (coordinates.charAt(0) == 'a'||coordinates.charAt(0)=='c'|| 
           coordinates.charAt(0) =='e'||coordinates.charAt(0)=='g')
           && (Integer.parseInt(Character.toString(coordinates.charAt(1))) % 2==0))
           || ((coordinates.charAt(0) =='b'||coordinates.charAt(0)=='d'|| 
           coordinates.charAt(0)=='f'||coordinates.charAt(0)=='h')
           && (Integer.parseInt(Character.toString(coordinates.charAt(1))) % 2 == 1)) ) {
           return true;
       }
        
        return false;
    }
}



/*You are given coordinates, a string that represents the coordinates of a square of the chessboard. Below is a chessboard for your reference.*/