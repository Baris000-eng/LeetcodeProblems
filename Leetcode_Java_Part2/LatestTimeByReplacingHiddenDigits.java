class Solution {

public String maximumTime(String time) {
    String t = "";
    if(time.substring(0,2).contentEquals("??")){
             t = t.concat("23");
    } else if(time.substring(1,2).contentEquals("?")){
        t = t.concat(time.substring(0,1));
        if(time.substring(0,1).contentEquals("2")) {
            t = t.concat("3");
        } else {
            t = t.concat("9");
        }
    }else if(time.substring(0,1).contentEquals("?")){
       int num = Integer.parseInt(time.substring(1,2));
       if(num >= 4){ 
            t = t.concat("1");
        } else{
            t = t.concat("2");
        }
         t = t.concat(time.substring(1,2));
    }
    else{
        t = t.concat(time.substring(0,2));
    }
    
    if(time.substring(3,5).contentEquals("??")) {
        t = t.concat(":59");
        
    }
    else if(time.substring(3,4).contentEquals("?")){
        t = t.concat(":5");
        t = t.concat(time.substring(4,5));
    } else if (time.substring(4,5).contentEquals("?")) {
        t = t.concat(time.substring(2,4));
        t = t.concat("9");
    } else{
        t = t.concat(time.substring(2,5));
    }
    return t;
}
}

/*You are given a string time in the form of hh:mm, where some of the digits in the string are hidden (represented by ?).

The valid times are those inclusively between 00:00 and 23:59.

Return the latest valid time you can get from time by replacing the hidden digits.*/



