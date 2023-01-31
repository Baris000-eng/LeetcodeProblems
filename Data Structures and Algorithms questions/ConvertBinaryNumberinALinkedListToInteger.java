/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        String str = "";

        while(head != null) {
            str = str + head.val;
            head = head.next;
        }

        int base_10_sum = 0;
        for(int i = 0; i < str.length(); i++){
            int coefficient = Integer.valueOf(String.valueOf(str.charAt(i)));
            int weighted_mult = coefficient * ((int) Math.pow(2,str.length() - 1 - i));
            base_10_sum = base_10_sum + weighted_mult;
        }
        
        return base_10_sum;
        
    }
}

//Given head which is a reference node to a singly-linked list. The value of each node in the linked 
//list is either 0 or 1. The linked list holds the binary representation of a number.

//Return the decimal value of the number in the linked list.

//The most significant bit is at the head of the linked list.

