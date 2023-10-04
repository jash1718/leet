/**
 * REMOVE DUPLICATES FROM SORTED ARRAY ||
 * Given an integer array nums sorted in non-decreasing order, remove some
 * duplicates in-place such that each unique element appears at most twice. The
 * relative order of the elements should be kept the same.
 */
public class Remove83 {

    public static void main(String[] args) {
        int nums[] = { 0, 0, 1, 1, 1, 1, 2, 2, 33 };
        System.out.println(duplicate(nums));
    }

    public static int duplicate(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n != nums[i - 2]) {
                nums[i++] = n;
            }

        }
        return i;
    }

}