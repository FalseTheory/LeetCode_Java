package longestIdealSubsequence;

public class Solution {
    public static int longestIdealString(String s, int k) {
        int idealLength = 1;
        for(int l = 0; l < s.length(); l++){
            int currentLength = 1;
            int prevIndex = l;
            for(int i = l+1; i < s.length();i++){
                if(Math.abs(s.charAt(i) - s.charAt(prevIndex)) <= k){
                    currentLength++;
                    prevIndex = i;
                }
            }
            if(currentLength>idealLength){
                idealLength = currentLength;
            }
        }

        return idealLength;
    }
    public static void main(String[] args) {
        System.out.println(longestIdealString("eduktdb",15));
    }
}


