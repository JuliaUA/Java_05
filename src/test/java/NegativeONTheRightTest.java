import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeONTheRightTest {
    //Test Data:
    //{4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
    @Test
    public void testNegativeONTheRightTest_MixedIntNumbers_HappyPath() {
        ///AAA
        //arrange
        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};

        //act
        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
