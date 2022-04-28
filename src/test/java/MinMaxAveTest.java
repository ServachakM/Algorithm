import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MinMaxAveTest {
    MinMaxAve mma;

    @BeforeEach
    void setup(){
        mma = new MinMaxAve();
    }

    @Order(1)
    @Test
    public void testMinMaxAveHappyPath(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 2;
        int end = 6;

        int[] expectedResult = {3, 7, 5};

        int[] actualResult = mma.minMaxAve(arr,start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testMinMaxAveHappyPathNegativeParam(){
        int[] arr = {1, -2, 3, -4, 5, -6, 7, -8};
        int start = 2;
        int end = 6;

        int[] expectedResult = {-6, 7, 1};

        int[] actualResult = mma.minMaxAve(arr,start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testMinMaxAveHappyPathNegativeParam2(){
        int[] arr = {-1, -2, -3, -4, -5, -6, -7, -8};
        int start = 2;
        int end = 6;

        int[] expectedResult = {-7, -3, -5};

        int[] actualResult = mma.minMaxAve(arr,start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testMinMaxAveEndSmallerStart(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 0;
        int end = -3;

        int[] expectedResult = {};

        int[] actualResult = mma.minMaxAve(arr,start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testMinMaxAveStartNegative(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = -1;
        int end = 3;

        int[] expectedResult = {};

        int[] actualResult = mma.minMaxAve(arr,start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testMinMaxAveArrayEmpty(){
        int[] arr = {};
        int start = 1;
        int end = 3;

        int[] expectedResult = {};

        int[] actualResult = mma.minMaxAve(arr,start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testMinMaxAveEndOutOfLength(){
        int[] arr = {5, 3, 4, 1};
        int start = 1;
        int end = 4;

        int[] expectedResult = {};

        int[] actualResult = mma.minMaxAve(arr,start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testMinMaxAveMaxValueInArray(){
        int[] arr = {5, 3, 4, 1, Integer.MAX_VALUE};
        int start = 2;
        int end = 4;

        int[] expectedResult = {};

        int[] actualResult = mma.minMaxAve(arr,start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testMinMaxAveMinValueInArray(){
        int[] arr = {5, Integer.MIN_VALUE, 4, 1};
        int start = 2;
        int end = 4;

        int[] expectedResult = {};

        int[] actualResult = mma.minMaxAve(arr,start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
