import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPositiveNumberTest {
    IsPositiveNumber result;

    @BeforeEach
    void setup(){
        result = new IsPositiveNumber();
    }

    @Order(1)
    @Test
    public void testIsPositiveNumberHappyPath(){
        int a = 555;

        boolean expectedResult = true;

        boolean actualResult = result.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testIsPositiveNumberZeroValue(){
        int a = 0;

        boolean expectedResult = true;

        boolean actualResult = result.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testIsPositiveNumberNegativeValue(){
        int a = -555;

        boolean expectedResult = false;

        boolean actualResult = result.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testIsPositiveNumberMaxValue(){
        int a = Integer.MAX_VALUE;

        boolean expectedResult = true;

        boolean actualResult = result.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testIsPositiveNumberMinValue(){
        int a = Integer.MIN_VALUE;

        boolean expectedResult = false;

        boolean actualResult = result.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testIsPositiveNumberSumParam(){
        int a = -125 + 126;

        boolean expectedResult = true;

        boolean actualResult = result.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testIsPositiveNumberSumParamMinMax(){
        int a = Integer.MIN_VALUE + Integer.MAX_VALUE;

        boolean expectedResult = false;

        boolean actualResult = result.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
