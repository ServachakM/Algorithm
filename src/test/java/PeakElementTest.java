import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class PeakElementTest {
    PeakElement peak;

    @BeforeEach
    void setup (){
        peak = new PeakElement();
    }

    @Order(1)
    @Test
    public void testPeakElementHappyPath(){
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};

        int[] expectedResult = {3, 7, 23};

        int[] actualResult = peak.peakElement2(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testPeakElementHappyPathNegativeParam(){
        int[] array = {-3, 2, 7, -5, 1, 9, -23, 1};

        int[] expectedResult = {7, 9, 1};

        int[] actualResult = peak.peakElement2(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testPeakElementParamWithZero(){
        int[] array = {0, -2, -7, -5, 0, -1};

        int[] expectedResult = {0, 0};

        int[] actualResult = peak.peakElement2(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testPeakElementArrayEmpty(){
        int[] array = {};

        int[] expectedResult = {};

        int[] actualResult = peak.peakElement2(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testPeakElementEqual(){
        int[] array = {8, 8, 8, 8, 8};

        int[] expectedResult = {};

        int[] actualResult = peak.peakElement2(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testPeakElementMaxValue(){
        int[] array = {Integer.MAX_VALUE, 25, 31, Integer.MAX_VALUE};

        int[] expectedResult = {Integer.MAX_VALUE, Integer.MAX_VALUE};

        int[] actualResult = peak.peakElement2(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
