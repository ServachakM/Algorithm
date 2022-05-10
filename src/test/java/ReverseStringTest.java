import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ReverseStringTest {
    ReverseString reverse;

    @BeforeEach
    void setup() {
        reverse = new ReverseString();
    }

    @Order(1)
    @Test
    public void testReverseStringHappyPath() {
        String test = "Abracadabra";

        String expectedResult = "arbadacarbA";

        String actualResult = reverse.reverseString(test);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void testReverseStringWithNumbers() {
        String test = "1Abra2cadab3ra4";

        String expectedResult = "4ar3badac2arbA1";

        String actualResult = reverse.reverseString(test);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void testReverseStringWithNumbersAndSpaces() {
        String test = "   1    Abra    2     cadab3ra4";

        String expectedResult = "4ar3badac     2    arbA    1   ";

        String actualResult = reverse.reverseString(test);

        Assertions.assertEquals(expectedResult,actualResult);
    }


    @Order(4)
    @Test
    public void testReverseStringOnlyNumbers() {
        String test = "1234567890";

        String expectedResult = "0987654321";

        String actualResult = reverse.reverseString(test);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(5)
    @Test
    public void testReverseStringSymbols() {
        String test = "!@#$%^&*()";

        String expectedResult = ")(*&^%$#@!";

        String actualResult = reverse.reverseString(test);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(6)
    @Test
    public void testReverseStringFIO() {
        String test = "Servachak Maria";

        String expectedResult = "airaM kahcavreS";

        String actualResult = reverse.reverseString(test);

        Assertions.assertEquals(expectedResult,actualResult);
    }

}
