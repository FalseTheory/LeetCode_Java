package compareVersionNumbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void Test1(){

        assertEquals(0,Solution.compareVersion("1.01","1.001"));
        assertEquals(0,Solution.compareVersion("1.0","1.0.0"));
        assertEquals(-1,Solution.compareVersion("0.1","1.1"));
    }
}
