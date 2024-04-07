package SubarrayProductLessThanK;

public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        assert numSubarrayProductLessThanK(new int[]{10,5,2,6},100) == 8;
        System.out.println("Working");
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int res = 0;
        double product=1;
        while(end<nums.length){
            product*=nums[end++];
            while(start<end && product>=k){
                product /= nums[start++];
            }
            res+=end-start;
        }
        return res;
    }

}
