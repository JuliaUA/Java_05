import org.testng.Assert;
import org.testng.annotations.Test;

public class KthLargestTest {
    //({4, 3, 7, 13, 5, 2, 9, 4, 12}, 3) → 9
    @Test
    public void testKthLargestPositiveNumbers_HappyPath() {
        ///AAA
        //arrange
        int[] array = {4, 3, 7, 13, 5, 2, 9, 4, 12};
        int numberK = 3;
        int expectedResult = 9;

        //act
        int actualResult = new KthLargest().kthLargest(array,numberK);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
