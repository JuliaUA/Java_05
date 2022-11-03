import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberOccurrencesTest {
    // Test Data:
    //{3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} →
    //{{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}
    @Test
    public void testNumberOccurences_HappyPath() {
        ///AAA
        //arrange
        int[] array ={3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
        int[][] expectedResult =  {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        //act
        int[][] actualResult = new NumberOccurrences().numberOccurrences(array);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

}
