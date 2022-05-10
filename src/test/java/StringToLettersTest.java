import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToLettersTest {
    StringToLetters strNew;

    @BeforeEach
    void setup(){
        strNew = new StringToLetters();
    }

    @Order(1)
    @Test
    public void testStringToLettersOnlyLetters(){
        String str = "ASDFGHbBNMJbcbdh";

        String expectedResult = "ASDFGHbBNMJbcbdh";

        String actualResult = strNew.stringToLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testStringToLettersNumbersAndLetters(){
        String str = "1ASDF2GHbB3NMJ7bcb8d1h089";

        String expectedResult = "ASDFGHbBNMJbcbdh";

        String actualResult = strNew.stringToLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testStringToLettersNumbersAndSpaces(){
        String str = "    1ASDF2GH   bB3  NMJ7b  cb8d1  h089 ";

        String expectedResult = "ASDFGHbBNMJbcbdh";

        String actualResult = strNew.stringToLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testStringToLettersNumbersAndSpacesAndSymbols(){
        String str = "    1ASD%^&&*F2GH |||!!!  bB3 )(**& NMJ7b ?>< cb8d1  h089 ";

        String expectedResult = "ASDFGHbBNMJbcbdh";

        String actualResult = strNew.stringToLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testStringToLettersEmptyString(){
        String str = "";

        String expectedResult = "";

        String actualResult = strNew.stringToLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testStringToLettersNoLetters(){
        String str = " 1254 1254 #$% 026652";

        String expectedResult = "";

        String actualResult = strNew.stringToLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
