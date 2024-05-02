package largestPositiveIntegerThatExistsWithItsNegative;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @DisplayName("Test Case 1")
    @Test
    public void caseTest1(){
        int[] arr = new int[]{-1,2,-3,3};
        int expectedNumber = 3;

        assertEquals(expectedNumber, Solution.findMaxK(arr),"Решение работает неправильно");

    }
    @DisplayName("Test Case 2")
    @Test
    public void caseTest2(){
        int[] arr = new int[]{-1,10,6,7,-7,1};
        int expectedNumber = 7;

        assertEquals(expectedNumber, Solution.findMaxK(arr),"Решение работает неправильно");

    }
    @DisplayName("Test Case 3")
    @Test
    public void caseTest3(){
        int[] arr = new int[]{-10,8,6,7,-2,-3};
        int expectedNumber = -1;

        assertEquals(expectedNumber, Solution.findMaxK(arr),"Решение работает неправильно");

    }


}
