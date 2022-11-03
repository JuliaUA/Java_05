import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {
    //Test Data:
    //({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
    @Test
    public void testMinMaxAve_PositiveNumbers_HappyPath() {
        ///AAA
        //arrange
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int firstIndex = 2;
        int secondNumber = 6;
        int[] expectedResult = {3, 7, 5};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(array,firstIndex,secondNumber);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
