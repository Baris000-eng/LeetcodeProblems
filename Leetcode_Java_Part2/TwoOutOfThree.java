class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        checkEqualityAndAddAccordingly(list, nums1, nums2);
        checkEqualityAndAddAccordingly(list, nums1, nums3);
        checkEqualityAndAddAccordingly(list, nums2, nums3);
        checkEqualityAndAddAccordinglyTripleVersion(list, nums1, nums2, nums3);


        List<Integer> uniques = list.stream()
                .distinct()
                .collect(Collectors.toList());

        return uniques;



        //Given three integer arrays nums1, nums2, and nums3, return a 
        //distinct array containing all the values that are present in at least 
        //two out of the three arrays. You may return the values in any order.








    }


    public void checkEqualityAndAddAccordingly(ArrayList<Integer>list, int[]a, int[]b) {
        for(int i = 0 ; i < a.length; i++) {
            for(int j = 0 ; j < b.length; j++) {
                if(a[i] == b[j]) {
                    list.add(a[i]);
                }
            }
        }
    }

    public void checkEqualityAndAddAccordinglyTripleVersion(ArrayList<Integer>list, int[]a, int[]b, int[]c) {
        for(int i = 0 ; i < a.length; i++) {
            for(int j = 0 ; j < b.length; j++) {
                for(int k = 0 ; k < c.length; k++) {
                    if(a[i] == b[j] && b[j] == c[k]) {
                        list.add(a[i]);
                    }
                }
            }
        }
    }



}