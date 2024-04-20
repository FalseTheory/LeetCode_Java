package guessNumberHigherOrLower;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.Random;


public class SolutionTest {

    private static Solution solution = new Solution(8);


    @Test
    void shouldGuessNumber() {
        assertEquals(solution.guessNumber(123),solution.getPick());
    }
}
