public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap < Integer, List < String >> hashMap = new HashMap < > (); //creating an hashmap for keeping the index summation values as keys and the strings correspoding to the indexes as values.
        int len1 = list1.length, len2 = list2.length; //assigning the lengths of the String array parameters to the variables called len1 and len2 respectively.
        for (int i = 0; i < len1; i++) { //going through the list1
            for (int j = 0; j < len2; j++) { //going through the list2
                if (list1[i].contentEquals(list2[j])) { //if the contents of the list1 and list2 are the same
                    if (hashMap.containsKey(i + j) == false) { //since the hashmap keys are unique, we should check whether hashMap does not contain the index summation value when the contents of the two lists are the same.
                        hashMap.put(i + j, new ArrayList <String> ()); //set the hashMap keys as the index summations
                    }
                   hashMap.get(i + j).add(list1[i]); //add all possible strings (corresponding to the same indexSum) to the values corresponding to the same indexSum.
                }
            }
        }
        
        int minimumIndexSum = Integer.MAX_VALUE; //since no value can be bigger than Integer.MAX_VALUE, I have assigned minimumIndexSum to the Integer.MAX_VALUE. (in order to get the minimum easier)
        for (int myKey: hashMap.keySet()) { //going through the keyset
             if(myKey <= minimumIndexSum) { //if a key is smaller than or equal to the minimumIndexSum
                 minimumIndexSum = myKey; //update the minimum index sum to this key
             }
        }
        int s = hashMap.get(minimumIndexSum).size(); 
        String[] resultArray = new String[s]; //create a String array with the size where the String values correspond to the minimum index summation value.
        return hashMap.get(minimumIndexSum).toArray(resultArray); //converting the ArrayList made of Strings to an array made of String variables.
    }
}

/*Given two arrays of strings list1 and list2, find the common strings with the least index sum.

A common string is a string that appeared in both list1 and list2.

A common string with the least index sum is a common string such that if it appeared at list1[i] and list2[j] then i + j should be the minimum value among all the other common strings.

Return all the common strings with the least index sum. Return the answer in any order.*/


/*The HashMap keys are always unique. */ 
