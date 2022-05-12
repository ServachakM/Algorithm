import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class RemoveDuplicatesTest {
    RemoveDuplicates strNew;

    @BeforeEach
    void setup(){
        strNew = new RemoveDuplicates();
    }

    @Order(1)
    @Test
    public void testRemoveDuplicatesHappyPath(){
        String str = "AABBCCaabbcc";

        String expectedResult = "abc";

        String actualResult = strNew.removeDuplicates2(str);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void testRemoveDuplicatesHappyPathAnotherInput(){
        String str = "AABBCCDDaabbccDDDD";

        String expectedResult = "abcd";

        String actualResult = strNew.removeDuplicates2(str);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void testRemoveDuplicatesHappyPathWithSpaces(){
        String str = " AABBCCDDaabbccDDDD   ";

        String expectedResult = "abcd";

        String actualResult = strNew.removeDuplicates2(str);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test
    public void testRemoveDuplicates(){
        String str = "     MMMMMMariaaaaaaa";

        String expectedResult = "mari";

        String actualResult = strNew.removeDuplicates2(str);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(5)
    @Test
    public void testRemoveDuplicatesLettersAndNumbers(){
        String str = "123SERSSAW456CVvcxx";

        String expectedResult = "serawcvx";

        String actualResult = strNew.removeDuplicates2(str);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(6)
    @Test
    public void testRemoveDuplicatesLettersAndNumbersAndSymbols(){
        String str = "123!@#$%^&*asd";

        String expectedResult = "asd";

        String actualResult = strNew.removeDuplicates2(str);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(7)
    @Test
    public void testRemoveDuplicatesEmpty(){
        String str = "";

        String expectedResult = "";

        String actualResult = strNew.removeDuplicates2(str);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
