/**
 * Remove Element from the array
 */
public class Remove {
    public static void main(String[] args) {
        int[] nums = { 2, 1, 1, 2 };
        int value = 1;
        System.out.println(removeElement(nums, value));
    }

    static int removeElement(int[] nums, int value) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != value) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;

    }
}