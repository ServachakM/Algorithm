import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AreNumbersEqualTest {
    AreNumbersEqual compare;

    @BeforeEach
    void setup(){
        compare = new AreNumbersEqual();
    }

    @Order(1)
    @Test
    public void testAreNumbersEqual(){
        int a = 89;
        int b = 89;

        int expectedResult = 0;

        int actualResult = compare.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testAreNumbersEqualFirstValueSmaller(){
        int a = -89;
        int b = 89;

        int expectedResult = -1;

        int actualResult = compare.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAreNumbersEqualFirstValueBigger(){
        int a = 89;
        int b = -89;

        int expectedResult = 1;

        int actualResult = compare.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAreNumbersEqualFirstValueMin(){
        int a = Integer.MIN_VALUE;
        int b = 89;

        int expectedResult = -1;

        int actualResult = compare.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAreNumbersEqualFirstValueZero(){
        int a = 0;
        int b = 89;

        int expectedResult = -1;

        int actualResult = compare.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testAreNumbersEqualSecondValueZero(){
        int a = 1;
        int b = 0;

        int expectedResult = 1;

        int actualResult = compare.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testAreNumbersEqualAllValueZero(){
        int a = 0;
        int b = 0;

        int expectedResult = 0;

        int actualResult = compare.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testAreNumbersEqualMinMaxValue(){
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;

        int expectedResult = 1;

        int actualResult = compare.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
