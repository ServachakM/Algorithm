import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SortArrayTest {
    SortArray sort;

    @BeforeEach
    void setup(){
        sort = new SortArray();

    }

    @Order(1)
    @Test
    public void testSortArrayHappyPath(){
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};

        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

       // int[] actualResult = sort.sortArray(array);

        int[] actualResult = sort.sortArray2(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSortArrayHappyPathNegativeParam(){
        int[] array = {-4, -3, -7, -12, 5, 2, 9, 4, 12};

        int[] expectedResult = {-12, -7, -4, -3, 2, 4, 5, 9, 12};

      //  int[] actualResult = sort.sortArray(array);

        int[] actualResult = sort.sortArray2(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testSortArrayHappyPathMaxMin(){
        int[] array = {Integer.MAX_VALUE, Integer.MIN_VALUE, 12};

        int[] expectedResult = {Integer.MIN_VALUE, 12, Integer.MAX_VALUE};

       // int[] actualResult = sort.sortArray(array);

        int[] actualResult = sort.sortArray2(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testSortArrayEmpty(){
        int[] array = {};

        int[] expectedResult = {};

        //int[] actualResult = sort.sortArray(array);

        int[] actualResult = sort.sortArray2(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testSortArrayZeroParam(){
        int[] array = {0, 0, 0, 0};

        int[] expectedResult = {0, 0, 0, 0};

       // int[] actualResult = sort.sortArray(array);

        int[] actualResult = sort.sortArray2(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }



}
