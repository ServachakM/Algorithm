import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToNumbersTest {
    StringToNumbers str;

    @BeforeEach
    void setup(){
        str = new StringToNumbers();
    }

    @Order(1)
    @Test
    public void testStringToNumbersHappyPath(){
        String test = "012345678";

        String expectedResult = "012345678";

        String actualResult = str.stringToNumbers(test);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void testStringToNumbersWithSpaces(){
        String test = " 0 1 2 3 4 5 6 7 8 ";

        String expectedResult = "012345678";

        String actualResult = str.stringToNumbers(test);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void testStringToNumbersWithSpacesAndLetters(){
        String test = " 0 1SD 2 VBN3 4cvg 5 df6 7dfdf 8 ";

        String expectedResult = "012345678";

        String actualResult = str.stringToNumbers(test);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test
    public void testStringToNumbersNoNumbers(){
        String test = "  SD  VBN cvg  df dfdf  ";

        String expectedResult = "";

        String actualResult = str.stringToNumbers(test);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(5)
    @Test
    public void testStringToNumbersOnlySpaces(){
        String test = "          ";

        String expectedResult = "";

        String actualResult = str.stringToNumbers(test);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(6)
    @Test
    public void testStringToNumbersEmptyString(){
        String test = "";

        String expectedResult = "";

        String actualResult = str.stringToNumbers(test);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
