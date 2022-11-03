import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {
    @Test
    public void testCountEvenValuesInArray_ArrayPositiveNumbers_HappyPath() {
        ///AAA
        //arrange
        int[] array = {1, 2, 3, 4, 5, 6, 10};
        int expectedResult = 4;

        //act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCountEvenValuesInArray_ArrayNegativeAndPositiveNumbers_HappyPath() {
        ///AAA
        //arrange
        int[] array = {1, -2, 3, 4, 5, -6, 10};
        int expectedResult = 4;

        //act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testCountEvenValuesInArray_ArrayAllZeros_HappyPath() {
        ///AAA
        //arrange
        int[] array = {0,0,0};
        int expectedResult = 3;

        //act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testCountEvenValuesInArray_ArrayNull_HappyPath() {
        ///AAA
        //arrange
        int[] array = null;
        int expectedResult = 0;

        //act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testCountOddValuesInArray_ArrayPositiveNumbers_HappyPath() {
        ///AAA
        //arrange
        int[] array = {1, 2, 3, 4, 5, 6, 10};
        int expectedResult = 3;

        //act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCountOddValuesInArray_ArrayNegativeAndPositiveNumbers_HappyPath() {
        ///AAA
        //arrange
        int[] array = {1, -21, 3, 4, 5, -6, 10};
        int expectedResult = 4;

        //act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testCountOddValuesInArray_ArrayAllZeros_HappyPath() {
        ///AAA
        //arrange
        int[] array = {0,0,0};
        int expectedResult = 0;

        //act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testCountOddValuesInArray_ArrayNull_HappyPath() {
        ///AAA
        //arrange
        int[] array = null;
        int expectedResult = 0;

        //act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testAreValuesGreaterThanNumber_GreaterThanZeroFalse_HappyPath() {
        ///AAA
        //arrange
        int[] array = {1, 3, -10, 88, 16};
        int number = 0;
        boolean expectedResult = false;

        //act
        boolean actualResult = new OddEvenValuesInArray().areValuesGreaterThanNumber(array,number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testAreValuesGreaterThanNumber_GreaterThanZeroTrue_HappyPath() {
        ///AAA
        //arrange
        int[] array = {1, 3, 10, 88, 16};
        int number = 0;
        boolean expectedResult = true;

        //act
        boolean actualResult = new OddEvenValuesInArray().areValuesGreaterThanNumber(array,number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);

    }
}
