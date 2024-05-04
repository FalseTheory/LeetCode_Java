package boatsToSavePeople;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void Test(){
        assertEquals(1,Solution.numRescueBoats(new int[]{1,2},3));
        assertEquals(3,Solution.numRescueBoats(new int[]{3,2,2,1},3));
        assertEquals(4,Solution.numRescueBoats(new int[]{3,5,3,4},5));
    }
}
