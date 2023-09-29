/**
 * Remove duplicates from sorted array..
 */
public class Duplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 3, 4, 4, 5 };
        System.out.println(removeduplicate(nums));
    }

    public static int removeduplicate(int[] nums)

    {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            } else {
                nums[count] = nums[i];
                count++;
            }

        }
        return count;
    }
}
