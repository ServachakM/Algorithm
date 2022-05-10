import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToNumbersAndSpacesTest {
    StringToNumbersAndSpaces res;

    @BeforeEach
    void setup(){
        res = new StringToNumbersAndSpaces();
    }
    @Order(1)
    @Test
    public void testStringToNumbersAndSpacesHappyPath(){
        String input = "1254  254  1254";

        String expectedResult = "1254  254  1254";

        String actualResult = res.stringToNumbersAndSpaces(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testStringToNumbersAndSpacesWithLetters(){
        String input = "1254DFGVNNmnbvc  254lkkjmggh  1254";

        String expectedResult = "1254  254  1254";

        String actualResult = res.stringToNumbersAndSpaces(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testStringToNumbersAndSpacesWithSymbols(){
        String input = "1254!@#$  @#%25^#$%4  12@#$54";

        String expectedResult = "1254  254  1254";

        String actualResult = res.stringToNumbersAndSpaces(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testStringToNumbersAndSpacesWithoutSpaces(){
        String input = "1254!@#$@#%25^#$%412@#$54";

        String expectedResult = "12542541254";

        String actualResult = res.stringToNumbersAndSpaces(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testStringToNumbersAndSpacesOnlySpaces(){
        String input = "    ";

        String expectedResult = "    ";

        String actualResult = res.stringToNumbersAndSpaces(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testStringToNumbersAndSpacesEmpty(){
        String input = "";

        String expectedResult = "";

        String actualResult = res.stringToNumbersAndSpaces(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testStringToNumbersAndSpacesWithoutNumbersAndSpaces(){
        String input = "ASDFvbhhnn!@#%ÂSGvbnnm";

        String expectedResult = "";

        String actualResult = res.stringToNumbersAndSpaces(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
