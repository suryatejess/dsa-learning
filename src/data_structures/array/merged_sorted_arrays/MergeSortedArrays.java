package data_structures.array.merged_sorted_arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        int[] mergedArray = merge_sorted_arrays(nums1, nums2);
        System.out.println(Arrays.toString(mergedArray));
    }

    public static int[] merge_sorted_arrays(int[] nums1, int[] nums2) {

        int mergedArraysLength = nums1.length + nums2.length;
        int[] mergedArrays = new int[nums1.length + nums2.length];

        int nums1Index = 0, nums2Index = 0, mergedIndex = 0;

        while (nums1Index < nums1.length && nums2Index < nums2.length) {
            if (nums1[nums1Index] < nums2[nums2Index]) {
                mergedArrays[mergedIndex++] = nums1[nums1Index++];
            }
            else {
                mergedArrays[mergedIndex++] = nums2[nums2Index++];
            }
        }

        while (nums1Index < nums1.length) {
            mergedArrays[mergedIndex++] = nums1[nums1Index++];
        }

        while (nums2Index < nums2.length) {
            mergedArrays[mergedIndex++] = nums2[nums2Index++];
        }

        return mergedArrays;
    }
}
