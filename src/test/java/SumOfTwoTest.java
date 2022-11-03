import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfTwoTest {
//({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
    @Test
    public void testSumOfTwo_HappyPath() {
        ///AAA
        //arrange
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int number = 12;
        int[][] expectedResult =  {{3, 9}, {7, 5}};

        //act
        int[][] actualResult = new SumOfTwo().sumOfTwo(array,number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
