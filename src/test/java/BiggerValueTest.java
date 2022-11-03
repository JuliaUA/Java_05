import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {
    //Test Data:
    //3333, 9999
    //Expected Result = 9999
    @Test
    public void testBiggerValuePositiveNumbers_HappyPath() {
        ///AAA
        //arrange
        int firstNumber = 3333;
        int secondNumber = 9999;
        int expectedResult = 9999;

        //act
        int actualResult = new BiggerValue().biggerValue(firstNumber,secondNumber);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
