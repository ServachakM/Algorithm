import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumArrayTest {
    SumArray sum;

    @BeforeEach
    void setUp() {
        sum = new SumArray();
    }

    @Order(1)
    @Test
    public void testSumArrayHappyPath(){
        int[] array = {0, 1, 2, 3, 4, 5};

        int expectedResult = 15;

        int actualResult = sum.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSumArrayHappyPathNegativeParam(){
        int[] array = {-7, -3};

        int expectedResult = -10;

        int actualResult = sum.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayHappyPathNegativePositiveParam(){
        int[] array = {-7, -3, -1, 0, 2, 5, 9};

        int expectedResult = 5;

        int actualResult = sum.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArraySumIsZero(){
        int[] array = {-7, -3, -1, 0, 2, 9};

        int expectedResult = 0;

        int actualResult = sum.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayEmpty(){
        int[] array = {};

        int expectedResult = Integer.MIN_VALUE;

        int actualResult = sum.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testSumArrayOneValue(){
        int[] array = {-5555555};

        int expectedResult = -5555555;

        int actualResult = sum.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayOutOfRange(){
        int[] array = {0,0,0,0,0};

        int expectedResult = 0;

        int actualResult = sum.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
