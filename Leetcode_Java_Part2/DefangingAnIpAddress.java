class Solution {
    public String defangIPaddr(String address) {
        int ipLength = address.length(), i = 0;
        String temp="";
        for(i=0; i<ipLength; i++) {
            temp = address.replace(".","[.]");
        }
        return temp;
    }
}


/*Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".*/