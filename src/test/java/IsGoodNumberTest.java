import org.testng.Assert;
import org.testng.annotations.Test;

public class IsGoodNumberTest {
    //Given an integer M perform the following conditional actions:
    //If M is multiple of 7 and 9 then return "Good Number".
    @Test
    public void testIsGoodNumber_MultiplySevenAndNine_HappyPath() {
        ///AAA
        //arrange
        int number = 63;
        String expectedResult = "Good Number";

        //act
        String actualResult = new IsGoodNumber().isGoodNumber(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //If M is only multiple of 9 and not of 7  then return "Bad Number"
    @Test
    public void testIsGoodNumber_MultiplyNineNotSeven_HappyPath() {
        ///AAA
        //arrange
        int number = 54;
        String expectedResult = "Bad Number";

        //act
        String actualResult = new IsGoodNumber().isGoodNumber(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    //If M is only multiple of 11 then return "Poor Number"
    @Test
    public void testIsGoodNumber_MultiplyEleven_HappyPath() {
        ///AAA
        //arrange
        int number = 22;
        String expectedResult = "Poor Number";

        //act
        String actualResult = new IsGoodNumber().isGoodNumber(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
    //If M doesn't satisfy any of the above conditions then return "-1"
    @Test
    public void testIsGoodNumber_NotMultiplySevenNineOrEleven_HappyPath() {
        ///AAA
        //arrange
        int number = 5;
        String expectedResult = "-1";

        //act
        String actualResult = new IsGoodNumber().isGoodNumber(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
