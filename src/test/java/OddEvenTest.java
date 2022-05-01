import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenTest {
    OddEven oE;

    @BeforeEach
    void setUp() {
        oE = new OddEven();
    }

    @Order(1)
    @Test
    public void testOddEvenHappyPathNegativeValue(){
        int a = -345;

        String expectedResult = "Odd";

        String actualResult = oE.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathZeroValue(){
        int a = 0;

        String expectedResult = "Even";

        String actualResult = oE.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void testOddEvenHappyPathPositiveValue() {
        int a = 222222;

        String expectedResult = "Even";

        String actualResult = oE.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(5)
    @Test
    public void testOddEvenMaxValue() {
        long a = 2147483647L + 1;
        String expectedResult = "Undefined";

        String actualResult = oE.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testOddEvenHappyPathMaxValue() {
        int a = 2147483647;

        String expectedResult = "Odd";

        String actualResult = oE.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testOddEvenMinValue() {
        int a = -2147483648;

        String expectedResult = "Even";

        String actualResult = oE.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testOddEvenMinValueOutOfRange() {
        long a = 21474836489L;

        String expectedResult = "Undefined";

        String actualResult = oE.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }





}





