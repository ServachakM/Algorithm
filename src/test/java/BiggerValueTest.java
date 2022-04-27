import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {
    BiggerValue bigger;

    @BeforeEach
    void setup(){
        bigger = new BiggerValue();
    }

    @Order(1)
    @Test
    public void testBiggerValueHappyPath(){
        int a = 3333;
        int b = 9999;

        int expectedResult = 9999;

        int actualResult = bigger.biggerValue(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testBiggerValueHappyPath2(){
        int a = 3333;
        int b = 0;

        int expectedResult = 3333;

        int actualResult = bigger.biggerValue(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testBiggerValueHappyPathNegativeValue(){
        int a = -3333;
        int b = -1;

        int expectedResult = -1;

        int actualResult = bigger.biggerValue(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testBiggerValueHappyPathNegativePositiveValue(){
        int a = -3333;
        int b = 11111;

        int expectedResult = 11111;

        int actualResult = bigger.biggerValue(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testBiggerValueEqual(){
        int a = 11111;
        int b = 11111;

        int expectedResult = 11111;

        int actualResult = bigger.biggerValue(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testBiggerValueEqualZero(){
        int a = 0;
        int b = 0;

        int expectedResult = 0;

        int actualResult = bigger.biggerValue(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testBiggerValueMaxMinValue(){
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;

        int expectedResult = Integer.MAX_VALUE;

        int actualResult = bigger.biggerValue(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
