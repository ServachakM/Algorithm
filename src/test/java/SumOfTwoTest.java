import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumOfTwoTest {
     SumOfTwo sum;

     @BeforeEach
    void setup(){
         sum = new SumOfTwo();
     }


     @Order(1)
     @Test
     public void testSumOfTwoTestHappyPath(){
        int[] arr = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;

        int[][] expectedResult = {{3, 9}, {7, 5}};

        int[][] actualResult = sum.sumOfTwo(arr,n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
     }

    @Order(2)
    @Test
    public void testSumOfTwoTestHappyPathNumberNine(){
        int[] arr = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 9;

        int[][] expectedResult = {{4, 5}, {7, 2}, {5, 4}};

        int[][] actualResult = sum.sumOfTwo(arr,n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testSumOfTwoTestHappyPathNumberEight(){
        int[] arr = {4, 3, 7, 12, 5, 2, 9, -4, 12};
        int n = 8;

        int[][] expectedResult = {{3, 5}, {12, -4}, {-4, 12}};

        int[][] actualResult = sum.sumOfTwo(arr,n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testSumOfTwoTestParamZero(){
        int[] arr = {0, 0, 0, 0};
        int n = 8;

        int[][] expectedResult = {};

        int[][] actualResult = sum.sumOfTwo(arr,n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testSumOfTwoTestEmptyArray(){
        int[] arr = {};
        int n = 8;

        int[][] expectedResult = {};

        int[][] actualResult = sum.sumOfTwo(arr,n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testSumOfTwoTestNumberZero(){
        int[] arr = {2, 1, -2, -3, 4, 7, 3};
        int n = 0;

        int[][] expectedResult = {{2, -2}, {-3, 3}};

        int[][] actualResult = sum.sumOfTwo(arr,n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


}
