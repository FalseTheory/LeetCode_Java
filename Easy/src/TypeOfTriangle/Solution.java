package TypeOfTriangle;

public class Solution {
    public String triangleType(int[] nums) {
        if(!isATriangle(nums)) return "none";

        if(nums[0] == nums[1] && nums[1] == nums[2]) return "equilateral";

        if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) return "isosceles";

        else return "scalene";
    }

    public boolean isATriangle(int[] nums) {
        if(nums[0] + nums[1] > nums[2]) {
            if(nums[0] + nums[2] > nums[1]) {
                return nums[1] + nums[2] > nums[0];
            }
        }
        return false;
    }
}
