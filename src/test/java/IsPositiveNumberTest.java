import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {
    //Проверьте работу метода на числах 555, 0 и -555.
    @Test
    public void testIsPositiveNumber_PositiveNumber_HappyPath() {
        ///AAA
        //arrange
        int number = 555;
        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIsPositiveNumber_Zero_HappyPath() {
        ///AAA
        //arrange
        int number = 0;
        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIsPositiveNumber_NegativeNumber_HappyPath() {
        ///AAA
        //arrange
        int number = -555;
        boolean expectedResult = false;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
