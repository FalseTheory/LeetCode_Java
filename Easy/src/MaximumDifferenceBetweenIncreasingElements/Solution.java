package MaximumDifferenceBetweenIncreasingElements;

public class Solution {
    public int maximumDifference(int[] nums) {
        int diff = -1;
        int min = nums[0];
        for(int i = 1; i < nums.length; i++) {
            int tmp = nums[i] - min;
            if(tmp > diff + 1) {
                diff = tmp;
            }
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        return diff;
    }
}
