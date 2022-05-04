import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class NegativeOnTheRightTest {
    NegativeOnTheRight result;

    @BeforeEach
    void setup(){
        result = new NegativeOnTheRight();
    }

    @Order(1)
    @Test
    public void testNegativeOnTheRightHappyPath(){
        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};

        int[] expectedResult = {4, 7, 5, 9, 4, 12, -2, -12, -3};

        int[] actualResult = result.negativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void testNegativeOnTheRightHappyPathWithZero(){
        int[] array = {0, -3, 7, -12, 5, -2, 0, -4, 12};

        int[] expectedResult = {0, 7, 5, 0, 12, -4, -2, -12, -3};

        int[] actualResult = result.negativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void testNegativeOnTheRightAllZero(){
        int[] array = {0, 0, 0, 0};

        int[] expectedResult = {0, 0, 0, 0};

        int[] actualResult = result.negativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test
    public void testNegativeOnTheRight(){
        int[] array = {};

        int[] expectedResult = {};

        int[] actualResult = result.negativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(5)
    @Test
    public void testNegativeOnTheRightAllPositive(){
        int[] array = {2, 4, 5, 0, 3};

        int[] expectedResult = {2, 4, 5, 0, 3};

        int[] actualResult = result.negativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
}
