import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {
    //Test Data:
    //{4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
    @Test
    public void testSortArrayPositiveNumbers_HappyPath() {
        ///AAA
        //arrange
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        //act
        int[] actualResult = new SortArray().sortArray(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
