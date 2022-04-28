import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MultipleMOfThreeAndOrFiveTest {
    MultipleMOfThreeAndOrFive result;

    @BeforeEach
    void setup(){
        result = new MultipleMOfThreeAndOrFive();
    }

    @Order(1)
    @Test
    public void testMultipleMOfThreeAndOrFiveHappyPath(){
        int m = 15;

        String expectedResult = "Good Number";

        String actualResult = result.multipleMOfThreeAndOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testMultipleMOfThreeAndOrFiveOnlyThree(){
        int m = 81;

        String expectedResult = "Bad Number";

        String actualResult = result.multipleMOfThreeAndOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testMultipleMOfThreeAndOrFiveOnlyFive(){
        int m = 1225;

        String expectedResult = "Poor Number";

        String actualResult = result.multipleMOfThreeAndOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testMultipleMOfThreeAndOrFiveNegativeParam(){
        int m = -45;

        String expectedResult = "Good Number";

        String actualResult = result.multipleMOfThreeAndOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testMultipleMOfThreeAndOrFive(){
        int m = 1;

        String expectedResult = "-1";

        String actualResult = result.multipleMOfThreeAndOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testMultipleMOfThreeAndOrFiveMinValue(){
        int m = Integer.MIN_VALUE;

        String expectedResult = "-1";

        String actualResult = result.multipleMOfThreeAndOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testMultipleMOfThreeAndOrFiveZeroParam(){
        int m = 0;

        String expectedResult = "Good Number";

        String actualResult = result.multipleMOfThreeAndOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testMultipleMOfThreeAndOrFiveSum(){
        int m = -1369 + 956498;

        String expectedResult = "-1";

        String actualResult = result.multipleMOfThreeAndOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(9)
    @Test
    public void testMultipleMOfThreeAndOrFiveDiv(){
        int m = 65432165 / 3;

        String expectedResult = "-1";

        String actualResult = result.multipleMOfThreeAndOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
