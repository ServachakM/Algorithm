import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToNumbersArrayTest {
     StringToNumbersArray result;

     @BeforeEach
    void setup(){
         result = new StringToNumbersArray();
     }

     @Order(1)
     @Test
    public void testStringToNumbersHappyPath(){
         String str = "1, 2, 3, 4, 5";

         int[] expectedResult = {1, 2, 3, 4, 5};

         int[] actualResult = result.stringToNumbers(str);

         Assertions.assertArrayEquals(expectedResult, actualResult);
     }

     @Order(2)
     @Test
    public void testStringToNumbersHappyPathNumbersPlusLetters(){
        String str = "a1, b2, c3, d4, e5";

        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = result.stringToNumbers(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testStringToNumbersMoreSpace(){
        String str = "   a1,     b2, c3, d4, e5    ";

        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = result.stringToNumbers(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testStringToNumbersHappyPathAnotherNumbers(){
        String str = "0, 9, 2, 7, 0";

        int[] expectedResult = {0, 9, 2, 7, 0};

        int[] actualResult = result.stringToNumbers(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testStringToNumbersDifferentSymbol(){
        String str = "-SSS--kju0,bvnm'./,9,,,,2vcgf,mklk7, +0  ";

        int[] expectedResult = {0, 9, 2, 7, 0};

        int[] actualResult = result.stringToNumbers(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
