import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {
    //Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}
    @Test
    public void testOddIndices_HappyPath() {
        ///AAA
        //arrange
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        //act
        int[] actualResult = new OddIndices().oddIndices(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

//    @Test
//    public void testOddIndicesNullArray_HappyPath() {
//        ///AAA
//        //arrange
//        int[] array = {};
//        int[] expectedResult = null;
//
//        //act
//        int[] actualResult = new OddIndices().oddIndices(array);
//
//        //Assert
//        Assert.assertEquals(actualResult,expectedResult);
//    }

}
