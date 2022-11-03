import org.testng.Assert;
import org.testng.annotations.Test;

public class PeakElementTest {
    //Test Data:
    //{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
    @Test
    public void testPeakElement_ArrayWithPositiveNumbers_HappyPath() {
        ///AAA
        //arrange
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        //act
        int[] actualResult = new PeakElement().peakElement(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
