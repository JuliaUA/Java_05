import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {
    //{2, 7, 3, 10} → {10, 3, 7, 2}
    @Test
    public void testReverseArray_PositiveNumbersInArray_HappyPath() {
        ///AAA
        //arrange
        int[] array = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        //act
        int[] actualResult = new ReverseArray().reverseArray(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

}
