import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {
    //Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
    @Test
    public void testMultiplyArrayByNumber_PositiveNumber_HappyPath() {
        ///AAA
        //arrange
        int[] array = {1, 2, 3, 4, 5};
        int number = 3 ;
        int[] expectedResult = {3, 6, 9, 12, 15};

        //act
        int[]actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array,number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    // toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
    @Test
    public void testToDoubleArrayFromIntArray_HappyPath() {
        ///AAA
        //arrange
        int[] array = {1, 2, 3, 4, 5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

        //act
        double[]actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    //toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}
    @Test
    public void testToIntArrayFromDoubleArray_HappyPath() {
        ///AAA
        //arrange
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        int[] expectedResult = {1, 2, 3, 4, 5};

        //act
        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    //toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
    @Test
    public void testToStringArrayFromIntArray_HappyPath() {
        ///AAA
        //arrange
        int[] array = {1, 2, 3, 4, 5};
        String[] expectedResult = {"1", "2", "3", "4", "5"};

        //act
        String [] actualResult = new ManipulationsWithArrays().toStringArray(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    //toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}
    @Test
    public void testToStringArrayFromDoubleArray_HappyPath() {
        ///AAA
        //arrange
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        String[] expectedResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};

        //act
        String [] actualResult = new ManipulationsWithArrays().toStringArray(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
