package reversePrefixOfWord;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void solutionTest1(){
        String word1 = "abcdefd";
        char ch1 = 'd';
        String expectedRes1 = "dcbaefd";

        Assertions.assertEquals(expectedRes1, Solution.reversePrefix(word1,ch1));
        Assertions.assertEquals(expectedRes1, Solution.reversePrefix2(word1,ch1));
    }
    @Test
    public void solutionTest2(){
        String word1 = "xyxzxe";
        char ch1 = 'z';
        String expectedRes1 = "zxyxxe";

        Assertions.assertEquals(expectedRes1, Solution.reversePrefix(word1,ch1));
        Assertions.assertEquals(expectedRes1, Solution.reversePrefix2(word1,ch1));
    }
    @Test
    public void solutionTest3(){
        String word1 = "abcd";
        char ch1 = 'z';
        String expectedRes1 = word1;

        Assertions.assertEquals(expectedRes1, Solution.reversePrefix(word1,ch1));
        Assertions.assertEquals(expectedRes1, Solution.reversePrefix2(word1,ch1));
    }

}
