package RemoveDuplicatesFromSortedArray;

public class RemoveDuplicates {

    public static void main(String[] args) {
        assert removeDuplicates(new int[]{1,2,3})==2;
        assert removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4})==5;
        System.out.println("Working");
    }

    public static int removeDuplicates(int[] nums){
        int start = 0;
        int unique = 1;
        while(unique<nums.length){
            if(nums[unique]>nums[start]){
                nums[start+1] = nums[unique];
                start++;
            }
            unique++;
        }
        return start+1;
    }
}
