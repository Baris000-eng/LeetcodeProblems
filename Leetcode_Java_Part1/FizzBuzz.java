class Solution {
    public List<String> fizzBuzz(int n) {
        if(n<=0) { //if n is smaller than or equal to 0
            return null; //return a null list
        }
        List<String>myList = new ArrayList<String>(); //creating an arraylist with string type of elements
        for(int i=1; i<=n; i++) { //going through all additions
            if(i%3==0 && i%5==0) { //if i is both divisible by 5 and 3
                myList.add("FizzBuzz"); //add FizzBuzz to list
            } else if(i%3==0 && i%5!=0) { //if i is only divisible by 3 and not divisible by 5
                 myList.add("Fizz"); //add Fizz to list
            } else if(i%5==0 && i%3!=0) { //if i is only divisible by 5 and not divisible by 3
                 myList.add("Buzz"); //add Buzz to list
            } else { //otherwise
                String s = String.valueOf(i); //convert the value to a string
                myList.add(s); //add the String s to the list
            }
        }
        return myList; //return list
    }
}