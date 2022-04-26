import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddIndicesTest {
    OddIndices oInd;

    @BeforeEach
    void setUp() {
        oInd = new OddIndices();
    }

    @Order(1)
    @Test
    public void testOddIndicesHappyPath(){
        int[] input = {-45, 590, 234, 985, 12, 68};

        int[] expectedResult =  {590, 985, 68};

        int[] actualResult = oInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddIndicesHappyPathNegativeValue(){
        int[] input = {-45, -590, -234, -985, -12, -68};

        int[] expectedResult =  {-590, -985, -68};

        int[] actualResult = oInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddIndicesArrayLengthIsOne(){
        int[] input = {1};

        int[] expectedResult = {};

        int[] actualResult = oInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testOddIndicesArrayEmpty(){
        int[] input = {};

        int[] expectedResult = {};

        int[] actualResult = oInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(5)
    @Test
    public void testOddIndicesShortArray(){
        int[] input = {2,0};

        int[] expectedResult = {0};

        int[] actualResult = oInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testOddIndicesMinMaxValue(){
        int[] input = {Integer.MIN_VALUE,Integer.MAX_VALUE};

        int[] expectedResult = {Integer.MAX_VALUE};

        int[] actualResult = oInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testOddIndicesOllValueZero(){
        int[] input = {0,0,0,0,0,0};

        int[] expectedResult = {0,0,0};

        int[] actualResult = oInd.oddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }





}
