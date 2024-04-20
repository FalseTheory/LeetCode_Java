package guessNumberHigherOrLower;

import java.util.Random;

public class GuessGame{
    private final int pick;

    public GuessGame(int pick){
        this.pick = pick;
    }



    int guess(int num){
        if(num>pick){
            return -1;
        }
        else if(num<pick){
            return 1;
        }
        else {
            return 0;
        }
    }

    public int getPick() {
        return pick;
    }
}
