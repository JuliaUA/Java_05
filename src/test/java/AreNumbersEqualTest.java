import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {
    //Test Data:
    //89, 89
    //Expected result: 0
    @Test
    public void testNumbersEqual_PositiveNumbers_HappyPath() {
        ///AAA
        //arrange
        int firstNumber = 89;
        int secondNumber = 89;
        int expectedResult = 0;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(firstNumber,secondNumber);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    //-89, 89
    //Expected result: -1
    @Test
    public void testNumbersEqual_NegativeAndPositiveNumbers_HappyPath() {
        ///AAA
        //arrange
        int firstNumber = -89;
        int secondNumber = 89;
        int expectedResult = -1;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(firstNumber,secondNumber);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    //89, -89
    //Expected result: 1
    @Test
    public void testNumbersEqual_PositiveAndNegativeNumbers_HappyPath() {
        ///AAA
        //arrange
        int firstNumber = 89;
        int secondNumber = -89;
        int expectedResult = 1;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(firstNumber,secondNumber);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
