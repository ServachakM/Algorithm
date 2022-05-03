import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IntersectionTest {
    Intersection arr;

    @BeforeEach
    void setup(){
        arr = new Intersection();
    }

    @Order(1)
    @Test
    public void testIntersectionHappyPath(){

        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 4, 2};

        int[] expectedResult = {2, 4};

        int[] actualResult = arr.intersection(arr1, arr2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testIntersectionHappyPathNegativeParam(){

        int[] arr1 = {1, 2, 4, 5, 8, 9};
        int[] arr2 = {8, 9, -4, -2};

        int[] expectedResult = {8, 9};

       // int[] actualResult = arr.intersection(arr1, arr2);

        int[] actualResult = arr.intersection3(arr1, arr2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testIntersectionNoCommon(){

        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 45};

        int[] expectedResult = {};

     //   int[] actualResult = arr.intersection(arr1, arr2);

         int[] actualResult = arr.intersection3(arr1, arr2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testIntersectionArrayEmpty(){

        int[] arr1 = {};
        int[] arr2 = {8, 9, 45};

        int[] expectedResult = {Integer.MIN_VALUE};

        int[] actualResult = arr.intersection(arr1, arr2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testIntersectionAllArrayEmpty(){

        int[] arr1 = {};
        int[] arr2 = {};

        int[] expectedResult = {Integer.MIN_VALUE};

        int[] actualResult = arr.intersection(arr1, arr2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


    @Order(6)
    @Test
    public void testIntersectionValueZero(){

        int[] arr1 = {0, 0, 0};
        int[] arr2 = {0, 0};

        int[] expectedResult = {0};

       // int[] actualResult = arr.intersection(arr1, arr2);

        int[] actualResult = arr.intersection3(arr1, arr2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testIntersectionValueMax(){

        int[] arr1 = {2, 2, 1};
        int[] arr2 = {2, 0};

        int[] expectedResult = {2, 2};// {2}

        int[] actualResult = arr.intersection(arr1, arr2);

//      int[] actualResult = array.intersection3(arr1, arr2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
