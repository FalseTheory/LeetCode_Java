package FindTheDuplicateNumber;

public class FindTheDuplicateNumber {

    public static void main(String[] args) {
        assert findDuplicate(new int[]{3,1,3,4,2})==3;
        assert findDuplicate(new int[]{1,3,4,2,2})==2;
        assert findDuplicate(new int[]{3,3,3,3,3})==3;
        System.out.println("Working");
    }

    public static int findDuplicate(int[] nums) {
        int s = nums[0];
        int f = nums[0];
        do{
            s = nums[s];
            f= nums[nums[f]];
        }while(s!=f);
        f = nums[0];
        while(s!=f){
            s = nums[s];
            f = nums[f];
        }
        return s;

    }
}
