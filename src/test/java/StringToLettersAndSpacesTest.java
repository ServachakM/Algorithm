import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToLettersAndSpacesTest {
    StringToLettersAndSpaces lettersAndSpaces;

    @BeforeEach
    void setup(){
        lettersAndSpaces = new StringToLettersAndSpaces();
    }
    @Order(1)
    @Test
    public void testStringToLettersAndSpacesHappyPath(){
        String input = "   ASFDF    xcvb vbnm fghj bnmASD ";

        String expectedResult = "   ASFDF    xcvb vbnm fghj bnmASD ";

        String actualResult = lettersAndSpaces.stringToLettersAndSpaces(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testStringToLettersAndSpacesWithNumbers(){
        String input = "  1236 ASFDF  6584  xcvb vbnm9741 fghj bnmASD ";

        String expectedResult = "   ASFDF    xcvb vbnm fghj bnmASD ";

        String actualResult = lettersAndSpaces.stringToLettersAndSpaces(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testStringToLettersAndSpacesWithNumbersAndSymbols(){
        String input = "!@@#  1236 ASF%DF  6584  xc^*()vb vb++++nm9741 fghj bnmASD ";

        String expectedResult = "   ASFDF    xcvb vbnm fghj bnmASD ";

        String actualResult = lettersAndSpaces.stringToLettersAndSpaces(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testStringToLettersAndSpacesEmpty(){
        String input = "";

        String expectedResult = "";

        String actualResult = lettersAndSpaces.stringToLettersAndSpaces(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testStringToLettersAndSpacesNoLetters(){
        String input = "  15684563 !@#$%   $%^ 23165   12";

        String expectedResult = "          ";

        String actualResult = lettersAndSpaces.stringToLettersAndSpaces(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testStringToLettersAndSpacesNoLettersNoSpaces(){
        String input = "15684563!@#$%$%^2316512";

        String expectedResult = "";

        String actualResult = lettersAndSpaces.stringToLettersAndSpaces(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
