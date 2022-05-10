import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CountWordsTest {
    CountWords count;

    @BeforeEach
    void setup(){
        count = new CountWords();
    }

    @Order(1)
    @Test
    public void testCountWordsHappyPath(){
        String text = "As of March 2022, Java 18 is the latest version," +
                " while Java 17, 11 and 8 are the current long-term support" +
                " (LTS) versions. Oracle released the last zero-cost public " +
                "update for the legacy version Java 8 LTS in January 2019 for " +
                "commercial java use, although it will otherwise still support" +
                " Java 8 with public updates for personal use indefinitely. " +
                "Other vendors have begun to offer zero-cost builds of" +
                " OpenJDK 8 and 11 that are still receiving security and " +
                "other upgrades.";

        String word = "Java";

        int expectedResult = 5;

        int actualResult = count.countWords(text, word);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testCountWordsHappyPathNumber(){
        String text = "As of March 2022, Java 18 is the latest version," +
                " while Java 17, 11 and 8 are the current long-term support" +
                " (LTS) versions. Oracle released the last zero-cost public " +
                "update for the legacy version Java 8 LTS in January 2019 for " +
                "commercial java use, although it will otherwise still support" +
                " Java 8 with public updates for personal use indefinitely. " +
                "Other vendors have begun to offer zero-cost builds of" +
                " OpenJDK 8 and 11 that are still receiving security and " +
                "other upgrades.";

        String word = "17";

        int expectedResult = 1;

        int actualResult = count.countWords(text, word);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testCountWordsHappyPathWordTwo(){
        String text = "As of March 2022, Java 18 is the latest version," +
                " while Java 17, 11 and 8 are the current long-term support" +
                " (LTS) versions. Oracle released the last zero-cost public " +
                "update for the legacy version Java 8 LTS in January 2019 for " +
                "commercial java use, although it will otherwise still support" +
                " Java 8 with public updates for personal use indefinitely. " +
                "Other vendors have begun to offer zero-cost builds of" +
                " OpenJDK 8 and 11 that are still receiving security and " +
                "other upgrades.";

        String word = "version";

        int expectedResult = 2;

        int actualResult = count.countWords(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testCountWordsHappyPathSecondNumber(){
        String text = "As of March 2022, Java 18 is the latest version," +
                " while Java 17, 11 and 8 are the current long-term support" +
                " (LTS) versions. Oracle released the last zero-cost public " +
                "update for the legacy version Java 8 LTS in January 2019 for " +
                "commercial java use, although it will otherwise still support" +
                " Java 8 with public updates for personal use indefinitely. " +
                "Other vendors have begun to offer zero-cost builds of" +
                " OpenJDK 8 and 11 that are still receiving security and " +
                "other upgrades.";

        String word = "8";

        int expectedResult = 4;

        int actualResult = count.countWords(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testCountWordsHappyPathAnotherWord(){
        String text = "As of March 2022, Java 18 is the latest version," +
                " while Java 17, 11 and 8 are the current long-term support" +
                " (LTS) versions. Oracle released the last zero-cost public " +
                "update for the legacy version Java 8 LTS in January 2019 for " +
                "commercial java use, although it will otherwise still support" +
                " Java 8 with public updates for personal use indefinitely. " +
                "Other vendors have begun to offer zero-cost builds of" +
                " OpenJDK 8 and 11 that are still receiving security and " +
                "other upgrades.";

        String word = "oracle";

        int expectedResult = 1;

        int actualResult = count.countWords(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testCountWordsEmptyWord(){
        String text = "As of March 2022, Java 18 is the latest version," +
                " while Java 17, 11 and 8 are the current long-term support" +
                " (LTS) versions. Oracle released the last zero-cost public " +
                "update for the legacy version Java 8 LTS in January 2019 for " +
                "commercial java use, although it will otherwise still support" +
                " Java 8 with public updates for personal use indefinitely. " +
                "Other vendors have begun to offer zero-cost builds of" +
                " OpenJDK 8 and 11 that are still receiving security and " +
                "other upgrades.";

        String word = "";

        int expectedResult = 0;

        int actualResult = count.countWords(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testCountWordsEmptyText(){
        String text = "";

        String word = "Java";

        int expectedResult = 0;

        int actualResult = count.countWords(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
