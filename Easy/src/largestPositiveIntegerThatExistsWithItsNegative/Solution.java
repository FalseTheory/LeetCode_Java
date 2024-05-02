package largestPositiveIntegerThatExistsWithItsNegative;

import java.util.Arrays;

public class Solution {

    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] > 0 || nums.length == 1) {
            return -1;
        }
        int j = nums.length - 1;
        int i = 0;
        while (i < j) {
            if (nums[i] == -nums[j]) {
                return nums[j];
            }
            j--;
            if (nums[j] < 0) {
                i++;
                j = nums.length - 1;
            }

        }
        return -1;

    }
}
