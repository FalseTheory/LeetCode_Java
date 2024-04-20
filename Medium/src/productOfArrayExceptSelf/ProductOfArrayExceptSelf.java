package productOfArrayExceptSelf;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixArr = new int[n];
        int[] suffixArr = new int[n];
        prefixArr[0] = 1;
        suffixArr[n-1] = 1;
        for(int i = 1; i < n; i++){
            prefixArr[i] = prefixArr[i-1] * nums[i-1];
            suffixArr[n-1-i] = suffixArr[n-1-(i-1)] * nums[n - 1 - (i-1)];
        }
        for(int i = 0; i<n; i++){
            nums[i] = prefixArr[i] * suffixArr[i];
        }
        return nums;

    }
}
