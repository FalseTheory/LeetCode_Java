package productOfArrayExceptSelf.tests;


import org.junit.jupiter.api.Test;
import productOfArrayExceptSelf.ProductOfArrayExceptSelf;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();

    @Test
    void productExceptSelfTest1() {
        int[] inputNums = new int[]{1,2,3,4};
        int[] expectedResult = new int[]{24,12,8,6};
        assertArrayEquals(expectedResult, solution.productExceptSelf(inputNums));

    }
    @Test
    void productExceptSelfTest2(){
        int[] inputNums = new int[]{-1,1,0,-3,3};
        int[] expectedResult = new int[]{0,0,9,0,0};
        assertArrayEquals(expectedResult, solution.productExceptSelf(inputNums));
    }
}