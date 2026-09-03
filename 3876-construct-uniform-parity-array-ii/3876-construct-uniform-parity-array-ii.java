class Solution {
    public boolean uniformArray(int[] nums1) {
        int min_odd = Integer.MAX_VALUE;
        int min_even = Integer.MAX_VALUE;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 == 0) {
                min_even = Math.min(nums1[i], min_even);
            } else {
                min_odd = Math.min(nums1[i], min_odd);
            }
        }
        if (min_even > min_odd) {
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i] % 2 == 0) {
                    if ((nums1[i] - min_odd) < 1) {
                        return false;
                    }
                }
            }
        } else {
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i] % 2 != 0) {
                    if ((nums1[i] - min_odd) < 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}