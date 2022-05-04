import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ReverseArrayTest {
    ReverseArray rev;

    @BeforeEach
    void setup(){
        rev = new ReverseArray();
    }

    @Order(1)
    @Test
    public void testReverseArrayHappyPath(){
        int[] arr = {2, 7, 3, 10};

        int[] expectedResult = {10, 3, 7, 2};

        int[] actualResult = rev.reverseArray(arr);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void testReverseArrayHappyPathNegativeParam(){
        int[] arr = {-2, -7, -3, -10};

        int[] expectedResult = {-10, -3, -7, -2};

        int[] actualResult = rev.reverseArray(arr);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void testReverseArrayHappyPathNegativePositiveParam(){
        int[] arr = {-2, -7, 3, 10};

        int[] expectedResult = {10, 3, -7, -2};

        int[] actualResult = rev.reverseArray(arr);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test
    public void testReverseArrayEmpty(){
        int[] arr = {};

        int[] expectedResult = {};

        int[] actualResult = rev.reverseArray(arr);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(5)
    @Test
    public void testReverseArrayWithZero(){
        int[] arr = {0, 2, 0, 12587995};

        int[] expectedResult = {12587995, 0, 2, 0};

        int[] actualResult = rev.reverseArray(arr);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(6)
    @Test
    public void testReverseArrayWithMaxValue(){
        int[] arr = {Integer.MAX_VALUE, 2, 0, 12587995};

        int[] expectedResult = {12587995, 0, 2, Integer.MAX_VALUE};

        int[] actualResult = rev.reverseArray(arr);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(7)
    @Test
    public void testReverseArraySumValue(){
        int[] arr = {-125, 2, 0, 12587995, 15 + 36};

        int[] expectedResult = {15 + 36, 12587995, 0, 2, -125};

        int[] actualResult = rev.reverseArray(arr);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }


}
