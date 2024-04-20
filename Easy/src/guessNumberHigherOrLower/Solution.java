package guessNumberHigherOrLower;


public class Solution extends GuessGame{

    public Solution(int pick){
        super(pick);
    }


    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while(left<=right){
            int mid = left + (right-left) / 2;
            int guess = guess(mid);
            if(guess == 0){
                return mid;
            }else if(guess==-1){
                right = mid-1;
            }else{
                left = mid+1;
            }

        }

        return -1;

    }
}
