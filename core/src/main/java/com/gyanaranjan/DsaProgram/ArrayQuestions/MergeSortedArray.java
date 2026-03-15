package com.gyanaranjan.DsaProgram.ArrayQuestions;
//     You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and
//             two integers m and n,
//        representing the number of elements in nums1 and nums2 respectively.
//        Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//        The final sorted array should not be returned by the function, but instead be stored
//        inside the array nums1. To accommodate this, nums1 has a length of m + n,
//        where the first m elements denote the elements that should be merged, and the
//        last n elements are set to 0 and should be ignored. nums2 has a length of n.


public class MergeSortedArray {
    private static void merge(int[] nums1, int m, int[] nums2, int n) {

        // Make a copy of nums1
        int[] nums1Copy = new int[m];
        System.arraycopy(nums1, 0, nums1Copy, 0, m);

        // Pointers for nums1Copy and nums2
        int p1 = 0;
        int p2 = 0;

        // Pointer for nums1
        int p = 0;

        // Merge two arrays
        while (p1 < m && p2 < n) {
            if (nums1Copy[p1] <= nums2[p2]) {
                nums1[p] = nums1Copy[p1];
                p1++;
            } else {
                nums1[p] = nums2[p2];
                p2++;
            }
            p++;
        }

        // If there are elements left in nums1Copy, append them to nums1
        if (p1 < m) {
            System.arraycopy(nums1Copy, p1, nums1, p, m - p1);
        }

        // If there are elements left in nums2, append them to nums1
        if (p2 < n) {
            System.arraycopy(nums2, p2, nums1, p, n - p2);
        }


    }
    public static void main(String[] args) {

            int[] nums1 = {1, 2, 3, 0, 0, 0};
            int m = 3;
            int[] nums2 = {2, 5, 6};
            int n = 3;
            merge(nums1, m, nums2, n);
            for (int num : nums1) {
                System.out.print(num + " ");
            }
        }



}
